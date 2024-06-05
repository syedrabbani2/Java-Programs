import java.util.Scanner;

public class StringConcatenation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the first string: ");
        String firstString = scanner.nextLine();
        
        System.out.print("Enter the second string: ");
        String secondString = scanner.nextLine();
        
        String concatenatedString = concatenateStrings(firstString, secondString);
        
        System.out.println("Concatenated string: " + concatenatedString);
    }
    
    public static String concatenateStrings(String str1, String str2) {
        return str1 + str2;
    }
}
