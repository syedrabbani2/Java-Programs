import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("One");
        arrayList.add("Two");
        arrayList.add("Three");

        System.out.println("ArrayList: " + arrayList);

        // Removing an element
        arrayList.remove("Two");
        System.out.println("After removing 'Two': " + arrayList);

        // Iterating over elements
        System.out.print("Iterating over elements: ");
        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}
