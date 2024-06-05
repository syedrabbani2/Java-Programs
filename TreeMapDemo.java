import java.util.TreeMap;
import java.util.Map;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(3, "Third");
        treeMap.put(1, "First");
        treeMap.put(2, "Second");

        System.out.println("TreeMap: " + treeMap);

        // Retrieving a value
        int key = 2;
        String value = treeMap.get(key);
        System.out.println("Value for key " + key + ": " + value);
    }
}
