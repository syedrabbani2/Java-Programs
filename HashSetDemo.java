import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Orange");

        System.out.println("HashSet: " + hashSet);

        // Removing an element
        hashSet.remove("Banana");
        System.out.println("After removing 'Banana': " + hashSet);

        // Iterating over elements
        System.out.print("Iterating over elements: ");
        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}
