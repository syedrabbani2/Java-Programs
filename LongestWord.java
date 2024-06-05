import java.util.Scanner;

public class LongestWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        String longestWord = findLongestWord(input);
        
        System.out.println("Longest word: " + longestWord);
    }
    
    public static String findLongestWord(String str) {
        
        String[] words = str.split(" ");
        
     
        String longestWord = "";
        int maxLength = 0;
        
        
        for (String word : words) {
            
            word = word.replaceAll("[^a-zA-Z0-9]", "");
            
            if (word.length() > maxLength) {
                maxLength = word.length();
                longestWord = word;
            }
        }
        
        return longestWord;
    }
}
