import java.math.BigInteger;

public class FactorialBigInteger {
    public static void main(String[] args) {
        int number = 20; 

        
        BigInteger factorial = calculateFactorial(number);

        
        System.out.println("Factorial of " + number + " is: " + factorial);
    }

    
    public static BigInteger calculateFactorial(int number) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= number; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}
