package k.ary.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class KAryTree <T> {

  Node root=null;
  int nodes = 0;
  int K=0;


  public KAryTree(int k) {
    if(k<=1)
      k=2;
    this.K = k;
  }

  public boolean isEmpty() {

    return root == null;
  }

  public boolean isNotEmpty(){
    return root != null;
  }

  public void add(T value){
    nodes++;
    Node newNode = new Node(value);
    if( isEmpty()){
      root = newNode;
      return;
    }
    Queue<Node> queue = new LinkedList<>();
    queue.add(root);
    while(!queue.isEmpty()){

      Node currentNode = queue.poll();
      if(currentNode.children.size() < this.K){
        currentNode.addChild(newNode);
        return;
      }
      else {
        queue.addAll(currentNode.children);
      }
    }
  }

  public List<T> breadthFirstSearch(){
    List <T> tree = new ArrayList<>();
    Queue<Node> queue = new LinkedList<>();
    if(isNotEmpty()){
      queue.add(root);
      while(!queue.isEmpty()){

        Node currentNode = queue.poll();
        tree.add((T)currentNode.value);

        if(! currentNode.children.isEmpty())
          queue.addAll(currentNode.children);
      }
    }
    return tree;
  }


  public int getSize(){
    return nodes;
  }
  @Override
  public String toString() {
    return "K-ary tree (K="+this.K+"): {" +
      "\n root=" + root +
      "\nnodes=" + nodes +
      '}';
  }
}

