import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacters {
    public static void findDuplicateCharacters(String str) {
        if (str == null || str.isEmpty()) {
            System.out.println("String is empty or null.");
            return;
        }

        Map<Character, Integer> charFrequencyMap = new HashMap<>();

       
        for (char ch : str.toCharArray()) {
            charFrequencyMap.put(ch, charFrequencyMap.getOrDefault(ch, 0) + 1);
        }

  
        System.out.println("Duplicate characters in the string:");
        for (Map.Entry<Character, Integer> entry : charFrequencyMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + ": " + entry.getValue() + " times");
            }
        }
    }

    public static void main(String[] args) {
        String input = "programming";
        findDuplicateCharacters(input);
    }
}
