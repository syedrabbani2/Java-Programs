import java.util.Scanner;

public class MaximumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number:");
        double num1 = scanner.nextDouble();

        System.out.println("Enter the second number:");
        double num2 = scanner.nextDouble();

        double max = Math.max(num1, num2);

        System.out.println("The maximum of " + num1 + " and " + num2 + " is: " + max);

       
    }
}
