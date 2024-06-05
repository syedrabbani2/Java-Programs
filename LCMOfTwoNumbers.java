import java.util.Scanner;

public class LCMOfTwoNumbers {
	public static void main(String[] args) {


		Scanner scanner = new Scanner(System.in);

	
		System.out.print("Enter the first number: ");
		int num1 = scanner.nextInt();

		System.out.print("Enter the second number: ");
		int num2 = scanner.nextInt();

		
		int lcm = calculateLCM(num1, num2);

		
		System.out.println("The LCM of " + num1 + " and " + num2 + " is: " + lcm);

	}

	
	public static int calculateLCM(int a, int b) {
		
		return (a * b) / calculateGCD(a, b);
	}

	
	public static int calculateGCD(int a, int b) {
		
		if (b == 0) {
			return a;
		}
		
		return calculateGCD(b, a % b);
	}
}

