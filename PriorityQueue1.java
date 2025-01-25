package Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueue1 {
    public static void main(String[] args) {
        Queue<Integer> priorityQueue = new PriorityQueue<>();

        // Adding elements
        priorityQueue.add(30);
        priorityQueue.add(10);
        priorityQueue.add(20);

        // Displaying the queue (elements are sorted)
        System.out.println("PriorityQueue: " + priorityQueue);

        // Removing elements
        System.out.println("Removed: " + priorityQueue.remove()); // Removes the element with the highest priority (10)
        System.out.println("PriorityQueue after removal: " + priorityQueue);

        // Peeking the front element
        System.out.println("Peek: " + priorityQueue.peek()); // Shows the element with the highest priority (20) without removing it

        // Polling elements (removes and returns the element with the highest priority)
        System.out.println("Polled: " + priorityQueue.poll()); // Removes and returns the element with the highest priority (20)
        System.out.println("PriorityQueue after polling: " + priorityQueue);

        // Checking if the queue is empty
        System.out.println("Is the priority queue empty? " + priorityQueue.isEmpty());
    }
}
