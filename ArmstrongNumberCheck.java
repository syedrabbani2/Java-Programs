import java.util.Scanner;

public class ArmstrongNumberCheck {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);


		System.out.print("Enter a number: ");
		int number = scanner.nextInt();


		int originalNumber = number;


		int numDigits = String.valueOf(number).length();

		int armstrongSum = 0;


		while (originalNumber != 0) {
			int digit = originalNumber % 10;
			armstrongSum += Math.pow(digit, numDigits);
			originalNumber /= 10;
		}


		if (armstrongSum == number) {
			System.out.println(number + " is an Armstrong number.");
		} else {
			System.out.println(number + " is not an Armstrong number.");
		}

	}
}
