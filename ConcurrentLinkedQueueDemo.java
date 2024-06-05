import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.Iterator;

public class ConcurrentLinkedQueueDemo {
    public static void main(String[] args) {
        ConcurrentLinkedQueue<Integer> queue = new ConcurrentLinkedQueue<>();

        // Adding elements
        queue.add(1);
        queue.add(2);
        queue.add(3);

        // Removing elements
        queue.poll();

        // Iterating over elements
        Iterator<Integer> iterator = queue.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
