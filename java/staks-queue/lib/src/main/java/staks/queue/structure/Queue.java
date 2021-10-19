package staks.queue.structure;


import staks.queue.data.Node;

public class Queue<G> {
  private Node<G> front;
  private Node<G> rear;
  private int idx;

  public Queue() {
    this.idx = -1;
  }

  public void enqueue(G data) {
    Node<G> newNode = new Node<>(data);
    if (rear == null) {
      front = rear = newNode;
      idx++;
      return;
    }

    rear.next = newNode;
    rear = newNode;
    idx++;
  }

  public Node<G> dequeue() {
    if (idx < 0) {
      throw new NullPointerException();
    }
    Node<G> temp = front;
    front = front.next;
    idx--;
    if (front == null) {
      rear = null;
    }
    return front;
  }

  public int getIdx() {
    return idx;
  }

  public G peek() {
    if (idx < 0) {
      throw new NullPointerException();
    }

    return front.data;
  }

  public boolean isEmpty() {
    if (idx < 0) {
      return true;
    }
    return false;
  }

  @Override
  public String toString() {
    String queue = "";
    Node<G> trav = front;
    while (trav != null) {
      queue += trav.data + "->";
      trav = trav.next;
    }
    queue += "Null";

    return queue;
  }
}
