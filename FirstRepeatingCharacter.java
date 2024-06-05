import java.util.HashSet;
import java.util.Set;

public class FirstRepeatingCharacter {
    public static char findFirstRepeatingCharacter(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("String is empty or null.");
        }

        Set<Character> charSet = new HashSet<>();

        for (char ch : str.toCharArray()) {
            if (charSet.contains(ch)) {
                return ch;
            }
            charSet.add(ch);
        }

        throw new IllegalArgumentException("No repeating characters found in the string.");
    }

    public static void main(String[] args) {
        String input = "programming";
        try {
            char firstRepeatingChar = findFirstRepeatingCharacter(input);
            System.out.println("First repeating character in the string \"" + input + "\": " + firstRepeatingChar);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
