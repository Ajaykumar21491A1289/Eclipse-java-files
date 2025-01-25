package Queue;

//Node class to represent each element in the deque
class Node {
 int data;
 Node prev;
 Node next;

 Node(int data) {
     this.data = data;
     this.prev = null;
     this.next = null;
 }
}

//Deque class using a doubly linked list
class DequeUsingDoublyLinkedList {
 private Node front, rear;
 private int size;

 public DequeUsingDoublyLinkedList() {
     front = rear = null;
     size = 0;
 }

 // Method to add an element at the front of the deque
 public void addFront(int data) {
     Node newNode = new Node(data);
     if (front == null) {
         front = rear = newNode;
     } else {
         newNode.next = front;
         front.prev = newNode;
         front = newNode;
     }
     size++;
 }

 // Method to add an element at the rear of the deque
 public void addRear(int data) {
     Node newNode = new Node(data);
     if (rear == null) {
         front = rear = newNode;
     } else {
         newNode.prev = rear;
         rear.next = newNode;
         rear = newNode;
     }
     size++;
 }

 // Method to remove and return an element from the front of the deque
 public int removeFront() {
     if (front == null) {
         throw new IllegalStateException("Deque is empty");
     }
     int data = front.data;
     front = front.next;
     if (front != null) {
         front.prev = null;
     } else {
         rear = null;
     }
     size--;
     return data;
 }

 // Method to remove and return an element from the rear of the deque
 public int removeRear() {
     if (rear == null) {
         throw new IllegalStateException("Deque is empty");
     }
     int data = rear.data;
     rear = rear.prev;
     if (rear != null) {
         rear.next = null;
     } else {
         front = null;
     }
     size--;
     return data;
 }

 // Method to get the front element without removing it
 public int peekFront() {
     if (front == null) {
         throw new IllegalStateException("Deque is empty");
     }
     return front.data;
 }

 // Method to get the rear element without removing it
 public int peekRear() {
     if (rear == null) {
         throw new IllegalStateException("Deque is empty");
     }
     return rear.data;
 }

 // Method to check if the deque is empty
 public boolean isEmpty() {
     return size == 0;
 }

 // Method to get the size of the deque
 public int size() {
     return size;
 }

 // Method to display the elements of the deque
 public void display() {
     Node current = front;
     while (current != null) {
         System.out.print(current.data + " ");
         current = current.next;
     }
     System.out.println();
 }

 // Main method to test the deque implementation
 public static void main(String[] args) {
     DequeUsingDoublyLinkedList deque = new DequeUsingDoublyLinkedList();
     deque.addRear(10);
     deque.addRear(20);
     deque.addFront(30);
     deque.addFront(40);

     System.out.println("Deque elements:");
     deque.display();

     System.out.println("Removed from front: " + deque.removeFront());
     System.out.println("Removed from rear: " + deque.removeRear());
     System.out.println("Deque elements after removals:");
     deque.display();

     System.out.println("Peek front: " + deque.peekFront());
     System.out.println("Peek rear: " + deque.peekRear());
 }
}


/*
 remove elements from both ends.
addFront(int data): Inserts an element at the front.
addRear(int data): Inserts an element at the rear.
removeFront(): Removes and returns the element from the front.
removeRear(): Removes and returns the element from the rear.
peekFront(): Returns the element at the front without removing it.
peekRear(): Returns the element at the rear without removing it.
isEmpty(): Checks if the deque is empty.
size(): Returns the number of elements in the deque.
display(): Prints all elements in the deque.
*/
