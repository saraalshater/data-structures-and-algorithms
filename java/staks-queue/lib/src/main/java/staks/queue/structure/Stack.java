package staks.queue.structure;

import staks.queue.data.Node;


public class Stack {

    private Node top;


    public Stack() {

    }

    public void push(String data) {
      if (isEmpty()) {
        Node node = new Node(data);
        top = node;
      } else {
        Node node = new Node(data);
        node.setNext(top);
        top = node;
      }
    }

    public String pop() {
      if (isEmpty()) {
        return "Empty";
      } else {
        String data = top.getData();
        top = top.getNext();
        return data;
      }
    }

    public String peek() {
      if (isEmpty()) {
        return "Empty";
      } else {
        return top.getData();
      }
    }



    @Override
    public String toString() {
      return "Stack{" +
        "top=" + top +
        '}';
    }



    public boolean isEmpty() {
      return top == null;
    }

    public Node getTop() {
      return top;
    }


    public Integer getMaximum() {

      if(top == null){

        return 0;

      }
      int number = 0;
      while(top != null){
        if(Integer.parseInt(top.getData()) > number){

          number = Integer.parseInt(top.getData());

        }
        pop();
      }

      return number;

    }

  }
