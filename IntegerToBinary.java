public class IntegerToBinary {
    public static void main(String[] args) {
        int decimalNumber = 25;

        
        String binaryNumber = decimalToBinary(decimalNumber);
        System.out.println("Binary representation of " + decimalNumber + ": " + binaryNumber);

        int convertedDecimal = binaryToDecimal(binaryNumber);
        System.out.println("Decimal representation of " + binaryNumber + ": " + convertedDecimal);
    }

 
    public static String decimalToBinary(int decimalNumber) {
        StringBuilder binary = new StringBuilder();
        while (decimalNumber > 0) {
            int remainder = decimalNumber % 2;
            binary.insert(0, remainder);
            decimalNumber /= 2;
        }
        return binary.toString();
    }

    
    public static int binaryToDecimal(String binaryNumber) {
        int decimal = 0;
        int power = 0;
        for (int i = binaryNumber.length() - 1; i >= 0; i--) {
            int digit = binaryNumber.charAt(i) - '0';
            decimal += digit * Math.pow(2, power);
            power++;
        }
        return decimal;
    }
}
