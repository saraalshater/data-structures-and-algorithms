/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package staks.queue;

import staks.queue.structure.Queues;
import staks.queue.structure.Stack;

public class Main {
  public static void main(String[] args) {
    Stack nodeOne = new Stack();

    nodeOne.push("SARA");
    nodeOne.push("SAR");
    nodeOne.push("S");


//        System.out.println(nodeOne);

//        nodeOne.pop();
//        System.out.println(nodeOne);
//
//        System.out.println(nodeOne.peek());




    Queues nodeTwo = new Queues();

    nodeTwo.enqueue("SARA");
    nodeTwo.enqueue("SA");
    nodeTwo.enqueue("S");

    nodeTwo.peek();



    System.out.println(nodeTwo.peek());

//        nodeOne.pop();
//        System.out.println(nodeOne);
//
//        System.out.println(nodeOne.peek());


  }

}
