import java.util.Hashtable;
import java.util.Map;

public class HashtableDemo {
    public static void main(String[] args) {
        Hashtable<Integer, String> hashtable = new Hashtable<>();
        hashtable.put(1, "January");
        hashtable.put(2, "February");
        hashtable.put(3, "March");

        System.out.println("Hashtable: " + hashtable);

        // Retrieving a value
        int key = 2;
        String value = hashtable.get(key);
        System.out.println("Value for key " + key + ": " + value);
    }
}
