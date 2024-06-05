public class PrimitiveDataType {
    public static void main(String[] args) {
        
        byte byteVariable = 127;
        short shortVariable = 32767;
        int intVariable = 2147483647;
        long longVariable = 9223372036854775807L; 
        float floatVariable = 3.14f; 
        double doubleVariable = 3.14159265359;
        char charVariable = 'A';
        boolean booleanVariable = true;

        
        System.out.println("byteVariable: " + byteVariable);
        System.out.println("shortVariable: " + shortVariable);
        System.out.println("intVariable: " + intVariable);
        System.out.println("longVariable: " + longVariable);
        System.out.println("floatVariable: " + floatVariable);
        System.out.println("doubleVariable: " + doubleVariable);
        System.out.println("charVariable: " + charVariable);
        System.out.println("booleanVariable: " + booleanVariable);

        
        int sum = intVariable + shortVariable;
        System.out.println("Sum of intVariable and shortVariable: " + sum);

        double product = floatVariable * doubleVariable;
        System.out.println("Product of floatVariable and doubleVariable: " + product);

        charVariable++; 
        System.out.println("Incremented charVariable: " + charVariable);

        booleanVariable = !booleanVariable; 
        System.out.println("Negated booleanVariable: " + booleanVariable);
    }
}
