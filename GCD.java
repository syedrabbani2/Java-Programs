public class GCD {

    public static int findGCD(int num1, int num2) {
        
        num1 = Math.abs(num1);
        num2 = Math.abs(num2);

        
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        
        return num1;
    }
    
    public static void main(String[] args) {
        int num1 = 36;
        int num2 = 24;
        
        int gcd = findGCD(num1, num2);
        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);
    }
}
