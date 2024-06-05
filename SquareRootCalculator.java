import java.util.Scanner;

public class SquareRootCalculator {
  
    public static double calculateSquareRoot(double number) {
        return Math.sqrt(number);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();

        if (number < 0) {
            System.out.println("Cannot calculate square root of a negative number.");
        } else {
            double squareRoot = calculateSquareRoot(number);
            System.out.println("Square root of " + number + " is: " + squareRoot);
        }

  
    }
}
