package datastructures.linkedlist;

public class LinkedList
{
  Node head = null;
  Node tail = null;
  private int length = 0;
  public void insert(int value) {
    Node node = new Node(value);

    if(head == null){
      head = node;
      tail = node;
    } else {
      head.setPrevious(node);
      node.setNext(head);
      head = node;
    }

    length++;
  }

  public boolean includes(int findValue) {
    if(head == null){
      try {
        throw new Exception("The list is empty. Add a new node using LinkedList.insert(int)");
      } catch (Exception e) {
        throw new RuntimeException(e);
      }
    }

    Node current = head;

    while (current != null){
      if(findValue == current.getValue()){
        return true;
      }

      current = current.getNext();
    }

    return false;
  }

  public void append(int value){
    Node node = new Node(value);

    if(head == null){
      setupFirstNode(node, value);
    } else {
      tail.setNext(node);
      node.setPrevious(tail);
      tail = node;
    }

    length++;
  }

  public void insertBefore(int value, int findValue){
    Node node = new Node(value);
    Boolean updateLength = false;

    if(head == null){
      setupFirstNode(node, value);
      updateLength = true;
    } else {
      Node current = head;

      while (current != null){
        if(current.getValue() == findValue){

          if(head == current){
            head = node;
          }

          node.setNext(current);
          node.setPrevious(current.getPrevious());
          if(current.getPrevious() != null){
            current.getPrevious().setNext(node);
          }
          current.setPrevious(node);

          updateLength = true;

          break;
        } else {
          current = current.getNext();
        }
      }
    }

    if(updateLength == true) {
      length++;
    } else {
      System.out.println("Insert was aborted, " + findValue + " does not exists in the list.");
    }
  }

  public  void insertAfter(int value, int findValue){
    Node node = new Node(value);
    Boolean updateLength = false;

    if(head == null){
      setupFirstNode(node, value);
      updateLength = true;
    } else {
      Node current = head;

      while(current != null){
        if(current.getValue() == findValue){

          if(tail == current){
            tail = node;
          }

          node.setNext(current.getNext());
          node.setPrevious(current);
          current.setNext(node);

          updateLength = true;

          break;
        } else {
          current = current.getNext();
        }
      }
    }

    if(updateLength == true) {
      length++;
    } else {
      System.out.println("Insert was aborted, " + findValue + " does not exists in the list.");
    }
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
      stringBuilder.append("{ " + String.valueOf(current.getValue()) + " } -> ");
      current = current.getNext();
    }

    stringBuilder.append("NULL");

    return stringBuilder.toString();
  }

  private void setupFirstNode (Node node, int value){
    System.out.println("The list is empty. " + value + " will be inserted as the first node in the list.");

    head = node;
    tail = node;
  }
}
