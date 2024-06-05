public class DecimalToBinary {

    public static String decimalToBinary(int decimal) {
        
        if (decimal == 0) {
            return "0";
        }
        
        StringBuilder binary = new StringBuilder();
        
       
        while (decimal > 0) {
            int remainder = decimal % 2;
            binary.insert(0, remainder); 
            decimal /= 2;
        }
        
        return binary.toString();
    }
    
    public static void main(String[] args) {
        int decimalNumber = 25;
        String binaryNumber = decimalToBinary(decimalNumber);
        System.out.println("Binary representation of " + decimalNumber + " is: " + binaryNumber);
    }
}
