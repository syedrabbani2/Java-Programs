public class BooleanDataType {
    public static void main(String[] args) {
        
        boolean isJavaFun = true;
        boolean isProgrammingHard = false;

        
        System.out.println("Is Java fun? " + isJavaFun);
        System.out.println("Is programming hard? " + isProgrammingHard);

        
        if (isJavaFun) {
            System.out.println("Yes, Java is fun!");
        } else {
            System.out.println("No, Java is not fun!");
        }

        if (isProgrammingHard) {
            System.out.println("Programming is hard.");
        } else {
            System.out.println("Programming is not hard.");
        }

      
        boolean resultAnd = isJavaFun && isProgrammingHard;
        boolean resultOr = isJavaFun || isProgrammingHard;
        boolean resultNot = !isJavaFun;

        System.out.println("Result of AND operation: " + resultAnd);
        System.out.println("Result of OR operation: " + resultOr);
        System.out.println("Result of NOT operation: " + resultNot);
    }
}
