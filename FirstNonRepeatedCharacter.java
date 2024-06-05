import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatedCharacter {
    public static void main(String[] args) {
        String str = "hello world";
        char firstNonRepeated = findFirstNonRepeatedCharacter(str);
        
        if (firstNonRepeated != '\0') {
            System.out.println("First non-repeated character: " + firstNonRepeated);
        } else {
            System.out.println("No non-repeated character found.");
        }
    }
    
    public static char findFirstNonRepeatedCharacter(String str) {
        Map<Character, Integer> charCountMap = new HashMap<>();
        
       
        for (char ch : str.toCharArray()) {
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }
        
        
        for (char ch : str.toCharArray()) {
            if (charCountMap.get(ch) == 1) {
                return ch;
            }
        }
        
        
        return 0;
    }
}
