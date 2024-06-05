import java.util.Scanner;

public class PowerCalculator{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		
		System.out.print("Enter the base number: ");
		int base = scanner.nextInt();

		System.out.print("Enter the exponent: ");
		int exponent = scanner.nextInt();

		
		long result = calculatePower(base, exponent);

		
		System.out.println(base + " raised to the power of " + exponent + " is: " + result);

		scanner.close();
	}

	
	public static long calculatePower(int base, int exponent) {
		if (exponent == 0) {
			return 1;
		} else if (exponent == 1) {
			return base;
		} else {
			
			if (exponent < 0) {
				base = 1 / base;
				exponent = -exponent;
			}
			return base * calculatePower(base, exponent - 1);
		}
	}
}
