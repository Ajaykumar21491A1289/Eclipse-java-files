package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Buildin_Queue_Using_LinkedList {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        // Adding elements
        queue.add(10);
        queue.add(20);
        queue.add(30);

        // Displaying the queue
        System.out.println("Queue: " + queue);

        // Removing elements
        System.out.println("Removed: " + queue.remove()); // Removes the front element (10)
        System.out.println("Queue after removal: " + queue);

        // Peeking the front element
        System.out.println("Peek: " + queue.peek()); // Shows the front element (20) without removing it

        // Polling elements (removes and returns the front element)
        System.out.println("Polled: " + queue.poll()); // Removes and returns the front element (20)
        System.out.println("Queue after polling: " + queue);

        // Checking if the queue is empty
        System.out.println("Is the queue empty? " + queue.isEmpty());
    }
}
