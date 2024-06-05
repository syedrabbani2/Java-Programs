import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a non-negative number:");
        double number = scanner.nextDouble();

        if (number < 0) {
            System.out.println("Please enter a non-negative number.");
        } else {
            double squareRoot = Math.sqrt(number);
            System.out.println("The square root of " + number + " is: " + squareRoot);
        }

     
    }
}
