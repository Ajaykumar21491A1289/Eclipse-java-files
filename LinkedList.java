package Linked_List;
import java.util.*;
class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
		this.next=null;
	}
}

public class LinkedList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Linked List Operations");
		System.out.println("1.Insert an Element at Beginning");
		System.out.println("2.Insert an Element at End");
		System.out.println("3.Insert an Element at Specific Position");
		System.out.println("4.Delete from begining");
		System.out.println("5.Delete from End");
		System.out.println("6.Delete from Specific Position");
		System.out.println("7.Display");
		System.out.println("8.Reverse the Linked List");
		System.out.println("9.Exit");
		while(true) {
		System.out.println("Enter the Option");
		int ch = sc.nextInt();
		switch(ch) {
		case 1: insertAtBeginning();
		        break;
		case 2: insertAtEnd();
		        break;
		case 3: insertAtSpecificPosition();
		        break;
		case 4: deleteAtBegining();
		        break;
		case 5 : deleteFromEnd();
		         break;
		case 6 : deleteFromDpecificPosition();
		         break;
		case 7:  display();
		         break;
		case 8: reverse();
		        break;
		case 9 : System.exit(0);
		default : System.out.println("Enter valid Input");
		
		}
		
		}
	}

	private static void insertAtBeginning() {
		// TODO Auto-generated method stub
		
		
	}

	private static void insertAtEnd() {
		// TODO Auto-generated method stub
		
	}

	private static void insertAtSpecificPosition() {
		// TODO Auto-generated method stub
		
	}

	private static void deleteAtBegining() {
		// TODO Auto-generated method stub
		
	}

	private static void deleteFromEnd() {
		// TODO Auto-generated method stub
		
	}

	private static void deleteFromDpecificPosition() {
		// TODO Auto-generated method stub
		
	}

	private static void display() {
		// TODO Auto-generated method stub
		
	}

	private static void reverse() {
		// TODO Auto-generated method stub
		
	}

}
