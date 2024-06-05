public class PowerCalculator {

    public static double calculatePower(double base, int exponent) {
        double result = 1;
        
        
        if (exponent < 0) {
            base = 1 / base;
            exponent = -exponent;
        }
        
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        
        return result;
    }

    public static void main(String[] args) {
        double base = 2.0;
        int exponent = 5;
        
        double result = calculatePower(base, exponent);
        System.out.println(base + " raised to the power of " + exponent + " is: " + result);
    }
}
