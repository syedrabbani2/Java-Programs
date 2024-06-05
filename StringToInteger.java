public class StringToInteger {
    public static void main(String[] args) {
        
        String str = "123";
        int intValue = Integer.parseInt(str);
        System.out.println("String \"" + str + "\" converted to integer: " + intValue);

        
        int number = 456;
        String strValue = Integer.toString(number);
        System.out.println("Integer " + number + " converted to string: \"" + strValue + "\"");
    }
}
