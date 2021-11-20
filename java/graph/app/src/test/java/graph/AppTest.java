/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package graph;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

  @Test
  public void addVertex(){

    Graph graph = new Graph();

    graph.addVertex("Sara");
    graph.addVertex("Leen");

    assertNotNull(graph.getVertices());
    assertEquals(2,graph.size());
  }

  @Test
  public void addEdge(){

    Graph graph = new Graph();

    graph.addVertex("Sara");
    graph.addVertex("Maria");
    graph.addEdge("Sara", "Maria");

    assertEquals("Vertex{label='Maria'}[Vertex{label='Sara'}]Vertex{label='Sara'}[Vertex{label='Maria'}]", graph.printGraph());
  }

  @Test
  public void vertexNeighbors(){

    Graph graph = new Graph();

    graph.addVertex("Sara");
    graph.addVertex("Maria");
    graph.addVertex("Alaa");
    graph.addVertex("Leen");
    graph.addEdge("Sara", "Alaa");
    graph.addEdge("Sara", "Maria");
    graph.addEdge("Leen", "Maria");

    assertEquals("[Vertex{label='Alaa'}, Vertex{label='Maria'}]",graph.getNeighbors("Sara").toString());
    assertEquals("[Vertex{label='Maria'}]", graph.getNeighbors("Leen").toString());

  }

  @Test
  public void emptyGraph(){

    Graph graph = new Graph();
    assertEquals(0,graph.size());
    assertEquals("[]", graph.getVertices().toString());
  }

  @Test
  public void removeVertex(){

    Graph graph = new Graph();

    graph.addVertex("Sara");
    graph.addVertex("Leen");
    graph.addEdge("Sara", "Leen");
    assertEquals("Vertex{label='Leen'}[Vertex{label='Sara'}]Vertex{label='Sara'}[Vertex{label='Leen'}]",graph.printGraph());
    assertEquals(2, graph.size());

    graph.removeVertex("Sara");
    assertEquals("Vertex{label='Leen'}[]",graph.printGraph());
    assertEquals(1, graph.size());
  }

  @Test
  public void removeEdge(){
    Graph graph = new Graph();

    graph.addVertex("Sara");
    graph.addVertex("Leen");
    graph.addEdge("Sara", "Leen");
    assertEquals("Vertex{label='Leen'}[Vertex{label='Sara'}]Vertex{label='Sara'}[Vertex{label='Leen'}]",graph.printGraph());

    graph.removeEdge("Leen", "Sara");
    assertEquals("Vertex{label='Leen'}[]Vertex{label='Sara'}[]", graph.printGraph());
  }

  @Test
  public void oneVertexAndOneEdge(){
    Graph graph = new Graph();

    graph.addVertex("Sara");
    graph.removeEdge("Sara","Sara");

    assertEquals("Vertex{label='Sara'}[]",graph.printGraph());
  }

  //    <<<Code Challenge 36 >>
  @Test
  public void breadthFirst(){

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


    assertEquals("[Sara, Tareq, Doaa, Mohammad, Osaid, Naim]", graph1.breadthTraverse("Sara").toString());
  }

  @Test
  public void breadthFirstOneVertex(){

    Graph graph1 = new Graph();

    graph1.addVertex("Sara");
    assertEquals("[Sara]",graph1.breadthTraverse( "Sara").toString());
  }

  //    THIS TEST FOR THREE VERTICES AND ONE OF THEM DID NOT CONNECT WITH THE OTHER TWO VERTICES
  @Test
  public void breadthFirstTest(){

    Graph graph1 = new Graph();

    graph1.addVertex("Sara");
    graph1.addVertex("Tareq");
    graph1.addVertex("Doaa");

    graph1.addEdge("Sara", "Tareq");

    assertEquals("[Sara, Tareq]",graph1.breadthTraverse( "Sara").toString());
  }
}
