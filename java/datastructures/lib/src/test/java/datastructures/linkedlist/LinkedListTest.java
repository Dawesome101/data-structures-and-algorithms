package datastructures.linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LinkedListTest
{
  @Test void testAMethod()
    {
      LinkedList sut = new LinkedList();

      String testString01 = "{ 12 } ->{ -1 } ->{ 0 } ->{ 1 } ->{ 10 } -> NULL";
      int headTest = 12;
      int tailTest = 10;
      int lengthTest = 5;

      sut.insert(10);
      sut.insert(1);
      sut.insert(0);
      sut.insert(-1);
      sut.insert(12);

      System.out.println();
      System.out.println(sut.head.value);

      assertTrue(headTest == sut.head.value);
      assertTrue(tailTest == sut.tail.value);
      assertTrue(lengthTest == sut.getLength());

      assertTrue(sut.includes(10));
      assertTrue(!sut.includes(-20));

      assertTrue(testString01.equals(sut.toString()));
      assertTrue(!sut.toString().equals("Bad string"));
    }
}
