import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to reverse: ");
        String input = scanner.nextLine();
        
        String reversed = reverseString(input);
        
        System.out.println("Reversed string: " + reversed);
    }
    
    public static String reverseString(String str) {
        
        char[] charArray = str.toCharArray();
        
        
        int start = 0;
        int end = str.length() - 1;
        
        
        while (start < end) {
            
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;
            
            
            start++;
            end--;
        }
        
        
        return new String(charArray);
    }
}
