import java.util.Scanner;

public class QuadraticRoots {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.println("Enter the coefficients of the quadratic equation ax^2 + bx + c:");
        System.out.print("Enter a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter c: ");
        double c = scanner.nextDouble();

       
        double discriminant = b * b - 4 * a * c;

     
        if (discriminant > 0) {
            
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Roots of the quadratic equation are: " + root1 + " and " + root2);
        } else if (discriminant == 0) {
            
            double root = -b / (2 * a);
            System.out.println("Root of the quadratic equation is: " + root);
        } else {
            // No real roots (complex roots)
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
            System.out.println("Roots of the quadratic equation are complex:");
            System.out.println("Root 1: " + realPart + " + " + imaginaryPart + "i");
            System.out.println("Root 2: " + realPart + " - " + imaginaryPart + "i");
        }

       
    }
}
