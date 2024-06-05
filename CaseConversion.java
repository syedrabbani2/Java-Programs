public class CaseConversion {
    public static void main(String[] args) {
        String str = "Hello, world!";
        
        
        String uppercaseStr = toUpperCase(str);
        System.out.println("Original string: " + str);
        System.out.println("Uppercase string: " + uppercaseStr);
        
        
        String lowercaseStr = toLowerCase(str);
        System.out.println("Original string: " + str);
        System.out.println("Lowercase string: " + lowercaseStr);
    }
    
    
    public static String toUpperCase(String str) {
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (Character.isLowerCase(charArray[i])) {
                charArray[i] = Character.toUpperCase(charArray[i]);
            }
        }
        return new String(charArray);
    }
    
    
    public static String toLowerCase(String str) {
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (Character.isUpperCase(charArray[i])) {
                charArray[i] = Character.toLowerCase(charArray[i]);
            }
        }
        return new String(charArray);
    }
}
