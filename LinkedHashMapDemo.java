import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(2, "Tuesday");
        linkedHashMap.put(1, "Monday");
        linkedHashMap.put(3, "Wednesday");

        System.out.println("LinkedHashMap: " + linkedHashMap);

        // Retrieving a value
        int key = 1;
        String value = linkedHashMap.get(key);
        System.out.println("Value for key " + key + ": " + value);
    }
}
