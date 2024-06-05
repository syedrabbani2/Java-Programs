import java.util.Scanner;

public class SumOfDigitsUsingWhileLoop{
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		
		System.out.print("Enter a number: ");
		int number = scanner.nextInt();

		
		int sum = 0;
		int remainder;

		while (number != 0) {
			remainder = number % 10; 
			sum += remainder; 
			number /= 10; 
		}

		
		System.out.println("The sum of digits is: " + sum);	}
}



