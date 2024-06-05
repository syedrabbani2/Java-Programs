import java.util.Scanner;

public class TrapezoidArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length of the first parallel side (a):");
        double a = scanner.nextDouble();

        System.out.println("Enter the length of the second parallel side (b):");
        double b = scanner.nextDouble();

        System.out.println("Enter the height of the trapezoid:");
        double h = scanner.nextDouble();

        double area = calculateTrapezoidArea(a, b, h);

        System.out.println("The area of the trapezoid is: " + area);

        
    }

    public static double calculateTrapezoidArea(double a, double b, double h) {
        return 0.5 * (a + b) * h;
    }
}
