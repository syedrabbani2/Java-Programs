public class WrapperClass {
    public static void main(String[] args) {
       
        Integer intValue = 10; 
        System.out.println("Integer Value: " + intValue);

       
        Double doubleValue = 3.14;
        System.out.println("Double Value: " + doubleValue);

       
        Boolean boolValue = true; 
        System.out.println("Boolean Value: " + boolValue);

       
        int intValueUnboxed = intValue;
        System.out.println("Unboxed Integer Value: " + intValueUnboxed);

       
        double doubleValueUnboxed = doubleValue;
        System.out.println("Unboxed Double Value: " + doubleValueUnboxed);

       
        boolean boolValueUnboxed = boolValue;
        System.out.println("Unboxed Boolean Value: " + boolValueUnboxed);
    }
}
