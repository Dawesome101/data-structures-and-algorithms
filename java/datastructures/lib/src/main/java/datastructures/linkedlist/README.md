# Linked Lists

An implementation of a Singly Linked List which includes a length and a tail.

## Index

- [Back To Home](../../../../../../../../README.md)
- [Back To Data Structures](../../../../../../README.md)

## Uses

Constructor: `LinkedList()`

`.insert(int)` Creates a new node at the head with the value that is passed in. Returns nothing.

`.includes(int)` Boolean: Returns true if the value is in the list and false if it is not.

`.toString()` String: Returns a string of all the values in the list in the following format "{ value } -> { value } -> NULL"

`.getLength()` Integer: Returns an interger equal to the length of the list.

### Node Specifications

1. Create a Node class that has properties for the value stored in the Node, and a pointer to the next Node.

### Linked List Specifications

1. Create a Linked List class
   - Within your Linked List class, include a head property.
   - Upon instantiation, an empty Linked List should be created.
2. The class should contain the following methods
   - insert
     - Arguments: value
     - Returns: nothing
     - Adds a new node with that value to the head of the list with an O(1) Time performance.
   - includes
     - Arguments: value
     - Returns: Boolean
       - Indicates whether that value exists as a Node’s value somewhere within the list.
   - to string
     - Arguments: none
     - Returns: a string representing all the values in the Linked List, formatted as:
     - `"{ a } -> { b } -> { c } -> NULL"`
