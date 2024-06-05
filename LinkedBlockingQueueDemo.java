import java.util.concurrent.LinkedBlockingQueue;
import java.util.Iterator;

public class LinkedBlockingQueueDemo {
    public static void main(String[] args) {
        LinkedBlockingQueue<Integer> queue = new LinkedBlockingQueue<>();

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
