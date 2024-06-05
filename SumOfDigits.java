import java.util.Scanner;

public class SumOfDigits{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        int sum = calculateSumOfDigits(number);

        System.out.println("Sum of digits of " + number + " is: " + sum);
    }

    public static int calculateSumOfDigits(int number) {
        if (number == 0) {
            return 0;
        } else {
            return number % 10 + calculateSumOfDigits(number / 10);
        }
    }
}
