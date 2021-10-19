package staks.queue.structure;

//public class PseudoQueue {
//
//  Stack stack1 = new Stack();
//  Stack stack2 = new Stack();
//
//  public void enqueue(String string) {
//    stack1.push(string);
//  }
//
//  public String dequeue() {
//    if(stack1.isEmpty() && stack2.isEmpty()){
//      throw new IllegalArgumentException("Empty");
//    }
//    if (stack2.isEmpty()) {
//      while (stack1.isEmpty()) {
//        stack2.push(stack1.pop());
//      }
//    }
//    String node = stack2.pop();
//    if (stack1.isEmpty()) {
//      while (stack2.isEmpty()) {
//        stack1.push(stack2.pop());
//      }
//    }
//    return node;
//  }
//
//  public Stack getStack1() {
//    return stack1;
//  }
//
//  public Stack getStack2() {
//    return stack2;
//  }
//
//  @Override
//  public String toString() {
//    return "stack1========>" + stack1;
//  }
//
//}
