import java.util.TreeSet;
import java.util.Iterator;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Cat");
        treeSet.add("Dog");
        treeSet.add("Elephant");

        System.out.println("TreeSet: " + treeSet);

        // Removing an element
        treeSet.remove("Dog");
        System.out.println("After removing 'Dog': " + treeSet);

        // Iterating over elements
        System.out.print("Iterating over elements: ");
        Iterator<String> iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}
