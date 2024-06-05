import java.util.HashSet;
import java.util.Set;

public class StringPermutations {
    public static Set<String> findAllPermutations(String str) {
        Set<String> permutations = new HashSet<>();
        if (str == null || str.length() == 0) {
            permutations.add("");
            return permutations;
        }

        char initial = str.charAt(0);
        String remaining = str.substring(1);
        Set<String> words = findAllPermutations(remaining);
        for (String word : words) {
            for (int i = 0; i <= word.length(); i++) {
                String permutation = insertCharAt(word, initial, i);
                permutations.add(permutation);
            }
        }
        return permutations;
    }

    private static String insertCharAt(String word, char c, int pos) {
        String start = word.substring(0, pos);
        String end = word.substring(pos);
        return start + c + end;
    }

    public static void main(String[] args) {
        String input = "abc";
        Set<String> permutations = findAllPermutations(input);
        System.out.println("Permutations of " + input + ": " + permutations);
    }
}
