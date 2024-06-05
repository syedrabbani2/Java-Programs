import java.util.concurrent.ArrayBlockingQueue;
import java.util.Iterator;

public class ArrayBlockingQueueDemo {
    public static void main(String[] args) {
        ArrayBlockingQueue<Integer> arrayBlockingQueue = new ArrayBlockingQueue<>(3);
        try {
            arrayBlockingQueue.put(10);
            arrayBlockingQueue.put(20);
            arrayBlockingQueue.put(30);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("ArrayBlockingQueue: " + arrayBlockingQueue);

        // Removing an element
        int removedElement = arrayBlockingQueue.poll();
        System.out.println("Removed element: " + removedElement);
        System.out.println("ArrayBlockingQueue after removal: " + arrayBlockingQueue);

        // Iterating over elements
        System.out.print("Iterating over elements: ");
        Iterator<Integer> iterator = arrayBlockingQueue.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}
