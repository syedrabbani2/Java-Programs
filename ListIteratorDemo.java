import java.util.ListIterator;
import java.util.ArrayList;

public class ListIteratorDemo {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");

        System.out.println("ArrayList: " + arrayList);

        // Creating a ListIterator
        ListIterator<String> listIterator = arrayList.listIterator();

        // Iterating over elements using ListIterator
        System.out.print("Iterating over elements: ");
        while (listIterator.hasNext()) {
            System.out.print(listIterator.next() + " ");
        }
    }
}
