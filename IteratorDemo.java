import java.util.Iterator;
import java.util.HashSet;

public class IteratorDemo {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("X");
        hashSet.add("Y");
        hashSet.add("Z");

        System.out.println("HashSet: " + hashSet);

        // Creating an Iterator
        Iterator<String> iterator = hashSet.iterator();

        // Iterating over elements using Iterator
        System.out.print("Iterating over elements: ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}
