import java.util.Queue;
import java.util.LinkedList;
import java.util.Iterator;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Alice");
        queue.add("Bob");
        queue.add("Charlie");

        System.out.println("Queue: " + queue);

        // Removing an element
        String removedElement = queue.remove();
        System.out.println("Removed element: " + removedElement);
        System.out.println("Queue after removal: " + queue);

        // Iterating over elements
        System.out.print("Iterating over elements: ");
        Iterator<String> iterator = queue.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}
