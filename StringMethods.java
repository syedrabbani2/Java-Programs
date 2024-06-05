public class StringMethods {
    public static void main(String[] args) {
        String str = "Hello, world!";
        
       
        String subString = str.substring(7); // Extract substring starting from index 7
        System.out.println("Substring from index 7: " + subString);
        
        
        int index = str.indexOf("world"); // Find the index of the substring "world"
        System.out.println("Index of 'world': " + index);
        
        
        String anotherStr = "Hello, world!";
        boolean isEqual = str.equals(anotherStr); // Compare two strings for equality
        System.out.println("Are the strings equal? " + isEqual);
    }
}
