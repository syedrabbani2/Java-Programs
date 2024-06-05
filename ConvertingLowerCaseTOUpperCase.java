public class ConvertingLowerCaseTOUpperCase {
    public static void main(String[] args) {
        char lowercaseChar = 'a';
        char uppercaseChar = 'B';

       
        char convertedUppercase = (char) (lowercaseChar - 'a' + 'A');

        
        char convertedLowercase = (char) (uppercaseChar - 'A' + 'a');

        
        System.out.println("Lowercase character: " + lowercaseChar);
        System.out.println("Converted to Uppercase: " + convertedUppercase);

        System.out.println("\nUppercase character: " + uppercaseChar);
        System.out.println("Converted to Lowercase: " + convertedLowercase);
    }
}
