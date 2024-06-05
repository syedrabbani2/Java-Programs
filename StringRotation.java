public class StringRotation {
    public static boolean isRotation(String str1, String str2) {
        if (str1 == null || str2 == null || str1.length() != str2.length()) {
            return false;
        }
        
        
        String concatenated = str1 + str1;
        
        
        return concatenated.contains(str2);
    }

    public static void main(String[] args) {
        String str1 = "abcd";
        String str2 = "cdab";
        
        if (isRotation(str1, str2)) {
            System.out.println(str2 + " is a rotation of " + str1);
        } else {
            System.out.println(str2 + " is not a rotation of " + str1);
        }
    }
}
