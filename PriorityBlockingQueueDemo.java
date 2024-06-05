import java.util.concurrent.PriorityBlockingQueue;
import java.util.Iterator;

public class PriorityBlockingQueueDemo {
    public static void main(String[] args) {
        PriorityBlockingQueue<Integer> queue = new PriorityBlockingQueue<>();

        
        queue.add(3);
        queue.add(1);
        queue.add(2);

        
        queue.poll();

        
        Iterator<Integer> iterator = queue.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
