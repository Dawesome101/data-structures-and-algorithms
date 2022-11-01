package datastructures.linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LinkedListTest
{
  @Test void insertTest() {
    LinkedList sut = new LinkedList();

    sut.insert(10);
    sut.insert(1);
    sut.insert(0);
    sut.insert(-1);
    sut.insert(12);
    String testString = "{ 12 } -> { -1 } -> { 0 } -> { 1 } -> { 10 } -> NULL";
    doTests(sut,12, 10, 5, -1, 200, testString);
  }

  @Test void appendTest(){
    LinkedList sut = new LinkedList();

    sut.append(8);
    String testString = "{ 8 } -> NULL";
    doTests(sut, 8, 8, 1, 8, -20, testString);

    sut.append(21);
    testString = "{ 8 } -> { 21 } -> NULL";
    doTests(sut, 8, 21, 2, 8, -20, testString);

    sut.append(-10);
    testString = "{ 8 } -> { 21 } -> { -10 } -> NULL";
    doTests(sut, 8, -10, 3, 8, -20, testString);
  }

  @Test void insertBeforeTest(){
    LinkedList sut = new LinkedList();


    System.out.println("Test 1 --------");
    sut.insertBefore(6, 28);
    String testString = "{ 6 } -> NULL";
    doTests(sut, 6, 6, 1, 6, 22, testString);


    System.out.println("Test 2 --------");
    sut.insertBefore(17, 6);
    testString = "{ 17 } -> { 6 } -> NULL";
    doTests(sut, 17, 6, 2, 17, 22, testString);

    System.out.println("Test 3 --------");
    sut.insertBefore(25, 6);
    testString = "{ 17 } -> { 25 } -> { 6 } -> NULL";
    doTests(sut, 17, 6, 3, 25, 22, testString);

    sut.insertBefore(77, 22);
    doTests(sut, 17, 6, 3, 17, 22, testString);
  }

  @Test void insertAfterTest(){
    LinkedList sut = new LinkedList();

    sut.insertAfter(6, 28);
    String testString = "{ 6 } -> NULL";
    doTests(sut, 6, 6, 1, 6, 22, testString);

    sut.insertAfter(17, 6);
    testString = "{ 6 } -> { 17 } -> NULL";
    doTests(sut, 6, 17, 2, 17, 22, testString);

    sut.insertAfter(25, 6);
    testString = "{ 6 } -> { 25 } -> { 17 } -> NULL";
    doTests(sut, 6, 17, 3, 25, 22, testString);

    sut.insertAfter(8, 17);
    testString = "{ 6 } -> { 25 } -> { 17 } -> { 8 } -> NULL";
    doTests(sut, 6, 8, 4, 8, 22, testString);

    sut.insertAfter(77, 22);
    doTests(sut, 6, 8, 4, 17, 22, testString);
  }

  private void doTests(LinkedList linkedList,
                       int head,
                       int tail,
                       int length,
                       int includes,
                       int doesntInclude,
                       String testString){

    LinkedList sut = linkedList;

    assertTrue(head == sut.head.getValue());
    assertTrue(tail == sut.tail.getValue());
    assertTrue(length == sut.getLength());

    assertTrue(sut.includes(includes));
    assertTrue(!sut.includes(doesntInclude));

    assertTrue(testString.equals(sut.toString()));
    assertTrue(!sut.toString().equals("Bad string"));
  }
}
