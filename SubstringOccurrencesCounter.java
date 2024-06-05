import java.util.Scanner;

public class SubstringOccurrencesCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the main string: ");
        String mainString = scanner.nextLine();
        System.out.print("Enter the substring to count: ");
        String substring = scanner.nextLine();
        
        int occurrences = countOccurrences(mainString, substring);
        
        System.out.println("Number of occurrences of \"" + substring + "\": " + occurrences);
    }
    
    public static int countOccurrences(String mainString, String substring) {
        int count = 0;
        int index = 0;
        while ((index = mainString.indexOf(substring, index)) != -1) {
            count++;
            index += substring.length();
        }
        return count;
    }
}
