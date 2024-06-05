import java.util.HashMap;
import java.util.Map;

public class CharacterFrequency {
    public static Map<Character, Integer> findCharacterFrequency(String str) {
        Map<Character, Integer> frequencyMap = new HashMap<>();
        if (str == null) {
            return frequencyMap;
        }

        for (char ch : str.toCharArray()) {
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
        }

        return frequencyMap;
    }

    public static void main(String[] args) {
        String input = "hello world";
        Map<Character, Integer> frequencyMap = findCharacterFrequency(input);
        System.out.println("Character frequencies in \"" + input + "\":");
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
