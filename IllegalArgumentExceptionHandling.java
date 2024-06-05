public class IllegalArgumentExceptionHandling {
    public static void main(String[] args) {
        try {
            int age = -5;
            if (age < 0 || age > 120) {
                throw new IllegalArgumentException("Age must be between 0 and 120");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Illegal argument exception occurred: " + e.getMessage());
        }
    }
}
