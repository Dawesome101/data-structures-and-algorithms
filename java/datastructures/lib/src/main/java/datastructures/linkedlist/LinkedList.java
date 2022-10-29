package datastructures.linkedlist;

public class LinkedList
{
  Node head = null;
  Node tail = null;
  private int length = 0;
  public void insert(int value) {
    Node node = new Node(value);

    if(tail == null){
      tail = node;
    }

    node.next = head;
    head = node;
    length++;
  }

  public boolean includes(int value) {
    if(head == null){
      try {
        throw new Exception("The list is empty. Add a new node using LinkedList.insert(int)");
      } catch (Exception e) {
        throw new RuntimeException(e);
      }
    }

    Node current = head;

    while (current != null){
      if(value == current.value){
        return true;
      }

      current = current.next;
    }

    return false;
  }

  public int getLength(){
    return length;
  }

  @Override
  public String toString() {
    if(head == null){
      try {
        throw new Exception("The list is empty. Add a new node using LinkedList.insert(int)");
      } catch (Exception e) {
        throw new RuntimeException(e);
      }
    }

    Node current = head;

    StringBuilder stringBuilder = new StringBuilder();

    while (current != null){
      stringBuilder.append("{ " + String.valueOf(current.value) + " } ->");
      current = current.next;
    }

    stringBuilder.append(" NULL");

    return stringBuilder.toString();
  }
}
