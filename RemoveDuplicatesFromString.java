import java.util.LinkedHashSet;

public class RemoveDuplicatesFromString {
    public static String removeDuplicates(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        
        
        LinkedHashSet<Character> uniqueChars = new LinkedHashSet<>();
        
        
        for (char ch : str.toCharArray()) {
            uniqueChars.add(ch);
        }
        
  
        StringBuilder sb = new StringBuilder();
        for (char ch : uniqueChars) {
            sb.append(ch);
        }
        
        return sb.toString();
    }

    public static void main(String[] args) {
        String input = "programming";
        String result = removeDuplicates(input);
        System.out.println("Original string: " + input);
        System.out.println("String after removing duplicates: " + result);
    }
}
