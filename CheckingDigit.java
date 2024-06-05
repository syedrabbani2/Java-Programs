import java.util.Scanner;

public class CheckingDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        if (containsOnlyDigits(input)) {
            System.out.println("The string contains only digits.");
        } else {
            System.out.println("The string does not contain only digits.");
        }
    }
    
    public static boolean containsOnlyDigits(String str) {
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            if (!Character.isDigit(ch)) {
                return false;
            }
        }
        
        return true;
    }
}
