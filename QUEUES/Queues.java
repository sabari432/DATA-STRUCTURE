import java.util.LinkedList;
import java.util.Queue;

public class Queues {
    public static void main(String[] args) {
        // Create a Queue
        Queue<Integer> queue = new LinkedList<>();
        
        // Enqueue elements into the queue
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        
        // Display the front element without removing it
        System.out.println("Front element is: " + queue.peek());
        
        // Dequeue an element from the queue
        System.out.println("Dequeued element: " + queue.poll());
        
        // Check the queue after dequeuing
        System.out.println("Front element after dequeue: " + queue.peek());
        
        // Check if the queue is empty
        System.out.println("Is the queue empty? " + queue.isEmpty());
        
        // Print the queue
        System.out.println("Queue elements: " + queue);
    }
}
