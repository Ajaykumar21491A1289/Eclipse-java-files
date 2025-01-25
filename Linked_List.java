package CheatSheet;
import java.util.*;
public class Linked_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList<Integer> list = new LinkedList<Integer>();
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
sc.nextLine();
String s =sc.nextLine();
String[] s1 =s.split(" "); 

for(int i=0;i<n;i++) {
	list.add(Integer.parseInt(s1[i]));
}
int ele;
for(int i=0;i<n;i++) {
	if(i<=1)
		continue;
	else {
		ele = list.get(i);
		list.remove(i);
	    ele=ele+1;
	    list.add(i,ele);
	}
}
System.out.println(list);

}

}



class Node {
    int data;
    Node next;
    
    Node(int data) {
        this.data = data;
        this.next = null;
    }
//}

//public class LinkedList {

    // Function to modify the linked list
    public static Node AddAlternateNodes(Node head) {
        if (head == null) return null; // Return null if the list is empty

        Node current = head;
        int count = 0;

        // Traverse the list and modify alternate nodes
        while (current != null && current.next != null) {
            // Skip first two nodes, do not modify them
            if (count >= 2 && current.next.next != null) {
                current.next.data += current.data; // Add current node's data to next-to-next node
            }
            current = current.next; // Move to next node
            count++;
        }
        return head; // Return the modified list
    }

    // Function to print the linked list
    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Helper function to create a linked list from an array
    public static Node createLinkedList(int[] values) {
        if (values.length == 0) return null;

        Node head = new Node(values[0]);
        Node current = head;
        for (int i = 1; i < values.length; i++) {
            current.next = new Node(values[i]);
            current = current.next;
        }
        return head;
    }

    public static void main(String[] args) {
        // Example input: 7 nodes, 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7
        int[] values = {1, 2, 3, 4, 5, 6, 7};
        Node head = createLinkedList(values);

        System.out.println("Original Linked List:");
        printList(head);

        // Modify the linked list
        head = AddAlternateNodes(head);

        System.out.println("Modified Linked List:");
        printList(head);
    }
}

