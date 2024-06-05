import java.util.Vector;
import java.util.Iterator;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("Red");
        vector.add("Green");
        vector.add("Blue");

        System.out.println("Vector: " + vector);

        // Removing an element
        vector.remove("Green");
        System.out.println("Vector after removal: " + vector);

        // Iterating over elements
        System.out.print("Iterating over elements: ");
        Iterator<String> iterator = vector.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}
