import java.util.ArrayDeque;
import java.util.Iterator;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        ArrayDeque<String> arrayDeque = new ArrayDeque<>();
        arrayDeque.add("Apple");
        arrayDeque.add("Banana");
        arrayDeque.add("Orange");

        System.out.println("ArrayDeque: " + arrayDeque);

        // Removing an element
        String removedElement = arrayDeque.poll();
        System.out.println("Removed element: " + removedElement);
        System.out.println("ArrayDeque after removal: " + arrayDeque);

        // Iterating over elements
        System.out.print("Iterating over elements: ");
        Iterator<String> iterator = arrayDeque.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}
