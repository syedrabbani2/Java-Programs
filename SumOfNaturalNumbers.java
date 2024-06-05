import java.util.Scanner;

public class SumOfNaturalNumbers{
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		
		System.out.print("Enter the term up to which you want to calculate the sum: ");
		int term = scanner.nextInt();

		
		int sum = calculateSum(term);

		
		System.out.println("The sum of natural numbers up to term " + term + " is: " + sum);

		scanner.close();
	}

	
	public static int calculateSum(int n) {
		
		if (n == 0) {
			return 0;
		}
		
		return n + calculateSum(n - 1);
	}
}
