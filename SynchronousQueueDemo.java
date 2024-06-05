import java.util.concurrent.SynchronousQueue;

public class SynchronousQueueDemo {
    public static void main(String[] args) throws InterruptedException {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();

        // Adding elements
        queue.add(1);

        // Removing elements
        System.out.println("Removed element: " + queue.take());
    }
}
