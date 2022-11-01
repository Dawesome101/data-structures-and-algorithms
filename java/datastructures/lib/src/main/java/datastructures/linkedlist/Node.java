package datastructures.linkedlist;

public class Node {
  private int value;
  private Node previous = null;
  private Node next = null;
  Node(int value){
    this.value = value;
  }

  public int getValue() {
    return value;
  }

  public void setValue(int value) {
    this.value = value;
  }

  public Node getPrevious() {
    return previous;
  }

  public void setPrevious(Node previous) {
    this.previous = previous;
  }

  public Node getNext() {
    return next;
  }

  public void setNext(Node next) {
    this.next = next;
  }
}
