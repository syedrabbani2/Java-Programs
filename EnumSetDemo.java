import java.util.EnumSet;
import java.util.Iterator;

public class EnumSetDemo {
    enum Days { MONDAY, TUESDAY, WEDNESDAY }

    public static void main(String[] args) {
        EnumSet<Days> enumSet = EnumSet.of(Days.MONDAY, Days.TUESDAY, Days.WEDNESDAY);
        System.out.println("EnumSet: " + enumSet);

        // Removing an element (not supported in EnumSet)
        // Iterating over elements
        System.out.print("Iterating over elements: ");
        Iterator<Days> iterator = enumSet.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}
