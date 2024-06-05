public class NullPointerExceptionHandling {
    public static void main(String[] args) {
        try {
            
            String str = null;
            System.out.println("Length of the string: " + str.length());
        } catch (NullPointerException e) {
            
            System.out.println("Error: Null pointer exception occurred.");
        }
    }
}
