public class ArrayStoreExceptionHandling {
    public static void main(String[] args) {
        try {
            Object[] arr = new String[5];
            arr[0] = 10; // Storing integer in String array
        } catch (ArrayStoreException e) {
            System.out.println("Array store exception occurred!");
        }
    }
}
