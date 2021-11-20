package graph;

import java.util.*;

public class Graph {

  private final Map<Vertex, List<Vertex>> adjVertices;

  public Graph() {
    adjVertices = new HashMap<>();
  }

  void addVertex(String data) {
    Vertex vertex = new Vertex(data, weight);
    adjVertices.putIfAbsent(vertex, new ArrayList<>());
  }

  void addEdge(String data1, String data2) {
    Vertex vertex1 = new Vertex(data1, weight);
    Vertex vertex2 = new Vertex(data2, weight);

    adjVertices.get(vertex1).add(vertex2);
    adjVertices.get(vertex2).add(vertex1);
  }

  void removeVertex(String data) {
    Vertex vertex = new Vertex(data, weight);
    adjVertices.values().forEach(list -> list.remove(vertex));
    adjVertices.remove(vertex);
  }

  void removeEdge(String data1, String data2) {
    Vertex vertex1 = new Vertex(data1, weight);
    Vertex vertex2 = new Vertex(data2, weight);

    List<Vertex> edgeVertex1 = adjVertices.get(vertex1);
    List<Vertex> edgeVertex2 = adjVertices.get(vertex2);

    if (edgeVertex1 != null) {
      edgeVertex1.remove(vertex2);
    }

    if (edgeVertex2 != null) {
      edgeVertex2.remove(vertex1);
    }
  }

  String printGraph() {
    StringBuilder stringBuilder = new StringBuilder();
    for (Vertex vertex : adjVertices.keySet()) {
      stringBuilder.append(vertex);
      stringBuilder.append(adjVertices.get(vertex));
    }

    return stringBuilder.toString();
  }

  int size() {
    return adjVertices.size();
  }

  public Set<Vertex> getVertices(){
    return adjVertices.keySet();
  }

  Set<String> depthFirstTraverse(Graph graph, String root) {
    Set<String> visited = new LinkedHashSet<>();
    Stack<String> stack = new Stack<>();
    stack.push(root);

    while (!stack.isEmpty()) {
      String vertex = stack.pop();
      if (!visited.contains(vertex)) {
        visited.add(vertex);

        for (Vertex v : graph.getNeighbors(vertex)) {
          stack.push(v.data);
        }
      }
    }

    return visited;
  }

  Set<String> breadthTraverse(Graph graph, String root) {
    Set<String> visited = new LinkedHashSet<>();
    Queue<String> queue = new LinkedList<>();
    queue.add(root);
    visited.add(root);
    while (!queue.isEmpty()) {
      String vertex = queue.poll();
      for (Vertex v : graph.getNeighbors(vertex)) {
        if (!visited.contains(v.data)) {
          visited.add(v.data);
          queue.add(v.data);
        }
      }
    }
    return visited;
  }

  public List<Vertex> getNeighbors(String data) {
    return adjVertices.get(new Vertex(data, weight));
  }



  //    <<< Code Challenge 36 >>>

  Set<String> breadthTraverse( String root) {
    Set<String> visited = new LinkedHashSet<>();
    Queue<String> queue = new LinkedList<>();
    queue.add(root);
    visited.add(root);
    while (!queue.isEmpty()) {
      String vertex = queue.poll();
      for (Vertex v : getNeighbors(vertex)) {
        if (!visited.contains(v.data)) {
          visited.add(v.data);
          queue.add(v.data);
        }
      }
    }
    return visited;
  }

  //    <<< Code Challenge Code 37 >>>

  public void addEdgeWithWeight(String data1, String data2, int weight) {
    Vertex Vertex1 = new Vertex(data1, weight);
    Vertex Vertex2 = new Vertex(data2, weight);


    adjVertices.get(Vertex1).add(Vertex2);
    adjVertices.get(Vertex2).add(Vertex1);
  }

  int totalCost;
  public Integer businessTrip(Graph graph, List<String> cities){
    totalCost = 0;
    int citiesSize = cities.size();

    for (int i = 0; i < citiesSize - 1; i ++){

      findPath(cities.get(i), cities.get(i + 1), graph);
    }

    return totalCost;
  }

  private void findPath(String city1, String city2, Graph graph){

    if (graph.getNeighbors(city1) == null){
      return;
    }
    for (Vertex vertex: graph.getNeighbors(city1)) {
      if (Objects.equals(city2, vertex.data)){
        totalCost += vertex.weight;
      }
    }
  }


}
