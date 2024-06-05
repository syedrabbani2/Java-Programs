import java.util.HashSet;
import java.util.Set;

public class PangramCheck {
    public static boolean isPangram(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }

        
        Set<Character> letterSet = new HashSet<>();

        
        str = str.toLowerCase();

        
        for (char ch : str.toCharArray()) {
            
            if (ch >= 'a' && ch <= 'z') {
                
                letterSet.add(ch);
            }
        }

     
        return letterSet.size() == 26;
    }

    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog";
        if (isPangram(input)) {
            System.out.println("\"" + input + "\" is a pangram.");
        } else {
            System.out.println("\"" + input + "\" is not a pangram.");
        }
    }
}
