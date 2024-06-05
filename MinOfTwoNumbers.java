import java.util.Scanner;

public class MinOfTwoNumbers {

    public static int findMin(int num1, int num2) {
        return Math.min(num1, num2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        int min = findMin(num1, num2);

        System.out.println("The minimum of " + num1 + " and " + num2 + " is: " + min);

    }
}
