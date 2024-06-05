import java.util.Scanner;

public class MaxOfTwoNumbers {
    
    public static int findMax(int num1, int num2) {
        return Math.max(num1, num2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        int max = findMax(num1, num2);

        System.out.println("The maximum of " + num1 + " and " + num2 + " is: " + max);

        
    }
}
