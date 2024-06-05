import java.util.HashSet;
import java.util.Set;

public class CommonCharacters {
    public static Set<Character> findCommonCharacters(String str1, String str2) {
        if (str1 == null || str2 == null) {
            return new HashSet<>();
        }

        Set<Character> commonChars = new HashSet<>();
        Set<Character> set1 = new HashSet<>();
        
   
        for (char ch : str1.toCharArray()) {
            set1.add(ch);
        }

        
        for (char ch : str2.toCharArray()) {
            if (set1.contains(ch)) {
                commonChars.add(ch);
            }
        }

        return commonChars;
    }

    public static void main(String[] args) {
        String str1 = "programming";
        String str2 = "algorithm";

        Set<Character> commonChars = findCommonCharacters(str1, str2);
        System.out.println("Common characters in \"" + str1 + "\" and \"" + str2 + "\": " + commonChars);
    }
}
