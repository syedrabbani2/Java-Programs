public class PerfectNumberChecker {

    public static boolean isPerfectNumber(int number) {
        if (number <= 0) {
            return false; // Perfect numbers are positive integers
        }
        
        int sum = 0;
        
        // Find the sum of proper divisors
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        
        // Check if the sum equals the original number
        return sum == number;
    }

    public static void main(String[] args) {
        int number = 28; // Change this number to check for different numbers
        if (isPerfectNumber(number)) {
            System.out.println(number + " is a perfect number.");
        } else {
            System.out.println(number + " is not a perfect number.");
        }
    }
}
