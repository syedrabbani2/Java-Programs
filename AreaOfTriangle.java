import java.util.Scanner;

public class AreaOfTriangle {
    
    public static double calculateArea(double base, double height) {
        return 0.5 * base * height;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base of the triangle: ");
        double base = scanner.nextDouble();

        System.out.print("Enter the height of the triangle: ");
        double height = scanner.nextDouble();

        if (base <= 0 || height <= 0) {
            System.out.println("Base and height must be positive numbers.");
        } else {
            double area = calculateArea(base, height);
            System.out.println("The area of the triangle is: " + area);
        }

     
    }
}
