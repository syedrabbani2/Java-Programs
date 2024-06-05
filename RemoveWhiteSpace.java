import java.util.Scanner;

public class RemoveWhiteSpace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string with white spaces: ");
        String input = scanner.nextLine();
        
        String result = removeWhiteSpace(input);
        
        System.out.println("String with white spaces removed: " + result);
    }
    
    public static String removeWhiteSpace(String str) {
        
        return str.replaceAll("\\s", "");
    }
}
