import java.util.Scanner;

public class NumberFormatExceptionHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String input = scanner.nextLine();

        try {
            
            int number = Integer.parseInt(input);
            System.out.println("You entered: " + number);
        } catch (NumberFormatException e) {
            
            System.out.println("Error: Invalid input. Please enter a valid integer.");
        }
    }
}
