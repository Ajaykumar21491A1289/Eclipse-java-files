package Queue;
import java.util.*;
public class QueueUsingLinkedList {
public Node front,rear;
public QueueUsingLinkedList() {
	this.front = this.rear = null;
}
public static class Node{
	int data;
	Node next;
	public Node(int data) {
		this.data = data;
		this.next = null;
	}
	
}



public  void enqueue(int x) {
	Node newNode = new Node(x);
	if(front == null && rear == null)
		front = rear =newNode;
	else {
		rear.next=newNode;
		rear = newNode;
	}
		
}
public  void dequeue() {
	if(front == null )
		System.out.println("Queue is empty");
	else {
		 System.out.println("Removed element: " + front.data);
		front = front.next;
		if (front == null) 
            rear = null;
}
}
public void display() {
	if(front == null) {
		System.out.println("Queue is empty");
		return;
	}
	Node temp = front;
	while(temp!=null) {
		System.out.println(temp.data);
		temp = temp.next;
	}
}
public void peek() {
	if(front == null)
		System.out.println("Queue is empty");
	else
		System.out.println(front.data);
}

	public static void main(String[] args) {
		QueueUsingLinkedList q = new QueueUsingLinkedList();
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("The Following are queue operations");
			System.out.println("1. Enqueue");
			System.out.println("2. Dequeue");
			System.out.println("3. Peek");
			System.out.println("4. Display");
			System.out.println("5. Exit");
			int ch = sc.nextInt();
			switch(ch) {
			case 1:
				System.out.println("Enetr the data you want to insert");
				int data = sc.nextInt();
				q.enqueue(data);
				break;
			
			case 2:
				q.dequeue();
				break;
			case 3:
				q.peek();
				break;
			case 4:
				q.display();
				break;
			case 5:
				System.out.println("Exiting");
				sc.close();
				break;
			default:
				System.out.println("Invalid Input");
		}
		}

	}

}
