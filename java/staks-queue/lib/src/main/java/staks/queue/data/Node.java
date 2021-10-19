package staks.queue.data;


public class Node<T> {
  public Node<T> next;
  public T data;

  public Node( T data) {
    this.next = null;
    this.data = data;
  }

  public Node<T> getNext() {
    return next;
  }

  public void setNext(Node<T> next) {
    this.next = next;
  }

  public T getData() {
    return data;
  }

  public void setData(T data) {
    this.data = data;
  }
}
