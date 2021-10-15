package staks.queue.structure;

import staks.queue.data.Node;
import staks.queue.data.StackNode;

public class Stack {

  private Node top;

  public Stack() {
  }

  public void push(String data) {
    if (isEmpty()) {
      Node node = new StackNode(data);
      top = node;
    } else {
      Node node = new StackNode(data);
      node.setNext(top);
      top = node;
    }
  }

  public String pop() {
    if (isEmpty()) {
      return "Stack is empty";
    } else {
      String data = top.getData();
      top = top.getNext();
      return data;
    }
  }

  public String peek() {
    if (isEmpty()) {
      return "Stack is empty";
    } else {
      return top.getData();
    }
  }

  public boolean isEmpty() {
    return top == null;
  }
}
