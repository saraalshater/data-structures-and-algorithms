/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linked.list;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
  @Test
  void successfullyInstantiate(){
    LinkedList linkedList = new LinkedList();
    assertNull(linkedList.getHead() , "The Linked List should be empty");
  }
  @Test
  void insert(){
    LinkedList linkedList = new LinkedList();
    linkedList.insert("H");
    assertTrue(linkedList.include("H") , "Insertion Fiald");
  }
  @Test
  void isHeadCorrect(){
    LinkedList linkedList = new LinkedList();
    linkedList.insert("H");
    linkedList.insert("G");
    linkedList.insert("S");
    linkedList.insert("F");
    assertEquals(linkedList.getHead().getData() , "F" , "The head is not pointing on First Element");
  }
  @Test
  void insertMultipleNodes (){
    LinkedList linkedList = new LinkedList();
    linkedList.insert("H");
    linkedList.insert("G");
    linkedList.insert("S");
    linkedList.insert("F");
    assertTrue(linkedList.include("F"), "There is something wrong With Multiple Nodes Insertion");
    assertTrue(linkedList.include("S"), "There is something wrong With Multiple Nodes Insertion");
    assertTrue(linkedList.include("G"), "There is something wrong With Multiple Nodes Insertion");
    assertTrue(linkedList.include("H"), "There is something wrong With Multiple Nodes Insertion");
  }
  @Test
  void findExistValue(){
    LinkedList linkedList = new LinkedList();
    linkedList.insert("H");
    linkedList.insert("G");
    linkedList.insert("S");
    linkedList.insert("F");
    assertTrue(linkedList.include("F") , "The head is not pointing on First Element");
  }
  @Test
  void findNonExistValue(){
    LinkedList linkedList = new LinkedList();
    linkedList.insert("H");
    linkedList.insert("G");
    linkedList.insert("S");
    linkedList.insert("F");
    assertFalse(linkedList.include("D") , "The head is not pointing on First Element");
  }
  @Test
  void returnAllList (){
    LinkedList linkedList = new LinkedList();
    linkedList.insert("H");
    linkedList.insert("G");
    linkedList.insert("S");
    linkedList.insert("F");
    assertEquals(linkedList.toString() , "{ F } ->{ S } ->{ G } ->{ H } -> null" , "There is something wrong With Multiple Nodes Insertion");

  }

}
