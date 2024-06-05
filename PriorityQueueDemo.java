import java.util.PriorityQueue;
import java.util.Iterator;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(20);
        priorityQueue.add(10);
        priorityQueue.add(30);

        System.out.println("PriorityQueue: " + priorityQueue);

        // Removing an element
        int removedElement = priorityQueue.poll();
        System.out.println("Removed element: " + removedElement);
        System.out.println("Queue after removal: " + priorityQueue);

        // Iterating over elements
        System.out.print("Iterating over elements: ");
        Iterator<Integer> iterator = priorityQueue.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}
