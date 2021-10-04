package linked.list;

public class LinkedList {

  private Node head;

  public LinkedList() {
    head=null;
  }

  public void insert( String value) {
    Node newNode = new Node(value);
    if (head== null) {
      head = newNode;
    } else {
      newNode.setNext(head);
      head= newNode;
    }
  }


  public Boolean include(String value) {
    Node current = head;
    while (current != null ) {
      if(current.getData()==value) {
        return true;
      }
      current = current.getNext();
    }
    return false;
  }



  @Override
  public String toString() {
    Node current = head;
    String sortedList = "" ;
    while (current!=null) {
      sortedList = sortedList + "{ " + current.getData() + " } ->";
      current = current.getNext();
    }
    sortedList= sortedList + " null";
    return sortedList;
  }

  public Node getHead() {
    return head;
  }

}
