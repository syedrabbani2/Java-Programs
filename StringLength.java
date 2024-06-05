import java.util.Scanner;

public class StringLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        int length = findLength(input);
        
        System.out.println("Length of the string: " + length);
    }
    
    public static int findLength(String str) {
       
        return str.length();
    }
}
