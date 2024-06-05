public class SubstringCheck {
    public static boolean isSubstring(String str, String substr) {
        if (str == null || substr == null) {
            return false;
        }
        
        return str.contains(substr);
    }

    public static void main(String[] args) {
        String str = "hello world";
        String substr1 = "world";
        String substr2 = "java";
        
        if (isSubstring(str, substr1)) {
            System.out.println("\"" + substr1 + "\" is a substring of \"" + str + "\"");
        } else {
            System.out.println("\"" + substr1 + "\" is not a substring of \"" + str + "\"");
        }
        
        if (isSubstring(str, substr2)) {
            System.out.println("\"" + substr2 + "\" is a substring of \"" + str + "\"");
        } else {
            System.out.println("\"" + substr2 + "\" is not a substring of \"" + str + "\"");
        }
    }
}
