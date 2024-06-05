import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");

        System.out.println("LinkedList: " + linkedList);

        // Removing an element
        linkedList.remove("B");
        System.out.println("After removing 'B': " + linkedList);

        // Iterating over elements
        System.out.print("Iterating over elements: ");
        ListIterator<String> listIterator = linkedList.listIterator();
        while (listIterator.hasNext()) {
            System.out.print(listIterator.next() + " ");
        }
    }
}
