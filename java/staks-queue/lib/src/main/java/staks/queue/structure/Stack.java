package staks.queue.structure;

import staks.queue.data.Node;


public class Stack<G> {
  private int idx;
  private Node<G> top;

  public Stack() {
    this.idx = -1;
  }

  public int getIdx() {
    return idx;
  }
  public void push (G data) {
    Node newNode = new Node(data);
    if(top == null) {
      top = newNode;
      top.next = null;
    }

    else {
      newNode.next = top;
      top = newNode;
    }
    idx++;
  }
  public G pop () {
    if (top == null) {
      throw new NullPointerException();
    }
    Node<G> popped = top;
    top = top.next;
    idx--;
    return popped.data;
  }

  public G peek () {
    if(idx < 0) {
      throw new NullPointerException();
    }
    return top.data;

  }

  public boolean isEmpty() {
    if(idx >= 0){
      return false;
    }
    return true;
  }




  @Override
  public String toString() {
    String stackData = "";
    Node<G> trav = top;
    while (trav != null) {
      stackData += trav.data + " -> ";
      trav = trav.next;
    }
    stackData += "Null";
    return stackData;
  }
}
