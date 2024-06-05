import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();

        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();

        double area = calculateRectangleArea(length, width);

        System.out.println("The area of the rectangle is: " + area);
    }

    public static double calculateRectangleArea(double length, double width) {
        double area = length * width;
        return area;
    }
}
