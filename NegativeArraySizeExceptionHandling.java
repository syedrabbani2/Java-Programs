import java.util.Scanner;

public class NegativeArraySizeExceptionHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the size of the array: ");
            int size = scanner.nextInt();

            if (size < 0) {
                throw new NegativeArraySizeException("Array size cannot be negative.");
            }

            
            int[] array = new int[size];
            System.out.println("Array created successfully with size: " + size);
        } catch (NegativeArraySizeException e) {
            
            System.out.println("Error: " + e.getMessage());
        }
    }
}
