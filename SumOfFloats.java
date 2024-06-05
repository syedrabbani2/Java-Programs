import java.util.Scanner;

public class SumOfFloats {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first float number:");
        float num1 = scanner.nextFloat();

        System.out.println("Enter the second float number:");
        float num2 = scanner.nextFloat();

        float sum = num1 + num2;

        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);

       
    }
}
