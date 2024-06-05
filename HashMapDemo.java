import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "One");
        hashMap.put(2, "Two");
        hashMap.put(3, "Three");

        System.out.println("HashMap: " + hashMap);

        // Retrieving a value
        int key = 2;
        String value = hashMap.get(key);
        System.out.println("Value for key " + key + ": " + value);
    }
}
