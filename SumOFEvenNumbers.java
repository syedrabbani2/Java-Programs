public class SumOFEvenNumbers {

	public static void main(String[] args) {
		int sum = 0;


		for (int i = 1; i <= 100; i++) {

			if (i % 2 == 0) {
				sum += i; 
			}
		}


		System.out.println("Sum of even numbers between 1 to 100 is: " + sum);
	}
}

