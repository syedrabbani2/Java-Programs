import java.util.ArrayList;
import java.util.Iterator;

public class ConcurrentModificationExceptionHandling {
    public static void main(String[] args) {
        try {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(1);
            Iterator<Integer> iterator = list.iterator();
            list.remove(0); // Modifying the list while iterating
            iterator.next();
        } catch (java.util.ConcurrentModificationException e) {
            System.out.println("Concurrent modification exception occurred!");
        }
    }
}
