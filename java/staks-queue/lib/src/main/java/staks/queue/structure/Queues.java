package staks.queue.structure;


import staks.queue.data.Node;

public class Queues {

  private Node front;
  private Node rear;


  public void enqueue(String data) {
    if (isEmpty()) {
      Node node = new Node(data);
      front = node;
      rear = node;
    } else {
      Node node = new Node(data);
      rear.setNext(node);
      rear = node;
    }
  }

  public String dequeue() {
    if (isEmpty()) {
      return "Empty";
    } else {
      String data = front.getData();
      front = front.getNext();
      return data;
    }
  }

  public String peek() {
    return front.getData();
  }

  public boolean isEmpty() {
    return front == null;
  }

  @Override
  public String toString() {
    return "Queues{" +
      "front=" + front +
      ", rear=" + rear +
      '}';
  }
}
