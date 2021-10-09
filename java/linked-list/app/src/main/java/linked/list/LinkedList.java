package linked.list;

public class LinkedList {

  private Node head;
  private int size = 0;

  public int size() {
    return size;
  }

  public Node getHead() {
    return head;
  }
  public LinkedList() {
    head = null;
  }






  public void insert(String value) {
    Node newNode = new Node(value);
    if (head == null) {
      head = newNode;
    } else {
      newNode.setNext(head);
      head = newNode;
    }
  }


  public Boolean include(String value) {
    Node current = head;
    while (current != null) {
      if (current.getData() == value) {
        return true;
      }
      current = current.getNext();
    }
    return false;
  }


  @Override
  public String toString() {
    Node current = head;
    String sortedList = "";
    while (current != null) {
      sortedList = sortedList + "{ " + current.getData() + " } ->";
      current = current.getNext();
    }
    sortedList = sortedList + " null";
    return sortedList;
  }



  public static boolean palindorme(LinkedList list){
    boolean flag=true;
    if (list.head == null){
      return false;
    }else if (list.size == 1){
      return true;
    }else {
      String[] newArray = new String[list.size];
      Node current = list.head;
      int index =0;
      while (current != null){
        newArray[index] = current.toString();
        index ++;
        current = current.getNext();
      }for (int i = 0 ; i < newArray.length/2 ; i ++ ){
        if(newArray[i] != newArray[newArray.length-1-i]){
          flag= false;
          break;
        }
      }
    }
    return flag;
  }








}
