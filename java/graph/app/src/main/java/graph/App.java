/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package graph;

public class App {
  public static void main(String[] args) {


    Graph graph = new Graph();

    graph.addVertex("Sara");
    graph.addVertex("Leen");
    graph.addVertex("Maria");
    graph.addVertex("Alaa");

    graph.addEdge("Sara","Leen");
    graph.addEdge("Sara", "Maria");
    graph.addEdge("Sara", "Alaa");
    graph.addEdge("Leen","Maria");
    graph.addEdge("Maria","Alaa");
    graph.addEdge("Alaa", "Leen");

    System.out.println(graph.printGraph());

    graph.removeEdge("Alaa", "Maria");
    System.out.println();
    System.out.println("delete edge --> "+graph.printGraph());

    graph.removeVertex("Sara");
    System.out.println();
    System.out.println("delete vertex --> " + graph.printGraph());

    System.out.println();
    System.out.println(graph.getVertices());

    System.out.println();
    System.out.println(graph.getNeighbors("Leen"));

    System.out.println();
    System.out.println(graph.breadthTraverse(graph, "Alaa"));

    System.out.println();
    System.out.println(graph.depthFirstTraverse(graph, "Alaa"));

    System.out.println();
    System.out.println(graph.size());

    //        <<< Code Challenge 36 >>>

    Graph graph1 = new Graph();

    graph1.addVertex("Sara");
    graph1.addVertex("Tareq");
    graph1.addVertex("Doaa");
    graph1.addVertex("Mohammad");
    graph1.addVertex("Osaid");
    graph1.addVertex("Naim");

    graph1.addEdge("Sara", "Tareq");
    graph1.addEdge("Tareq", "Doaa");
    graph1.addEdge("Tareq", "Mohammad");
    graph1.addEdge("Doaa", "Osaid");
    graph1.addEdge("Doaa", "Naim");
    graph1.addEdge("Doaa", "Mohammad");
    graph1.addEdge("Mohammad", "Naim");
    graph1.addEdge("Osaid", "Naim");


    System.out.println(graph1.breadthTraverse( "Sara"));




  }
}