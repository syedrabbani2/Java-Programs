import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("A");
        vector.add("B");
        vector.add("C");

        System.out.println("Vector: " + vector);

        // Creating an enumeration
        Enumeration<String> enumeration = vector.elements();

        // Iterating over elements using enumeration
        System.out.print("Iterating over elements: ");
        while (enumeration.hasMoreElements()) {
            System.out.print(enumeration.nextElement() + " ");
        }
    }
}
