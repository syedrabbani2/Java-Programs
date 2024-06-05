import java.util.Scanner;

public class AreaOfTrapezoid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the first parallel side of the trapezoid: ");
        double side1 = scanner.nextDouble();

        System.out.print("Enter the length of the second parallel side of the trapezoid: ");
        double side2 = scanner.nextDouble();

        System.out.print("Enter the height of the trapezoid: ");
        double height = scanner.nextDouble();

        double area = calculateTrapezoidArea(side1, side2, height);

        System.out.println("The area of the trapezoid is: " + area);
    }

    public static double calculateTrapezoidArea(double side1, double side2, double height) {
        double area = (side1 + side2) * height / 2;
        return area;
    }
}
