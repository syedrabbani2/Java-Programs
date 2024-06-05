import java.util.Scanner;

public class ArithmeticOperations {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);


		System.out.print("Enter the first number: ");
		double num1 = scanner.nextDouble();


		System.out.print("Enter the second number: ");
		double num2 = scanner.nextDouble();


		double sum = num1 + num2;
		double subtraction = num1 - num2;
		double multiplication = num1 * num2;
		double division = num1 / num2;


		System.out.println("Sum: " + sum);
		System.out.println("subtraction: " + subtraction);
		System.out.println("multiplication: " + multiplication);
		System.out.println("division: " + division);

	}
}



