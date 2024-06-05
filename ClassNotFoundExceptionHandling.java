public class ClassNotFoundExceptionHandling {
    public static void main(String[] args) {
        try {
            
            Class.forName("NonExistentClass");
        } catch (ClassNotFoundException e) {
           
            System.out.println("Error: " + e.getMessage());
        }
    }
}
