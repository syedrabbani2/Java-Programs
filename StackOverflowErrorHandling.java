public class StackOverflowErrorHandling {
    public static void main(String[] args) {
        try {
            
            recursiveMethod(1);
        } catch (StackOverflowError e) {
            
            System.out.println("Error: Stack overflow occurred.");
        }
    }

    public static void recursiveMethod(int n) {
        
        if (n <= 0) {
            return;
        }
        
        recursiveMethod(n + 1);
    }
}
