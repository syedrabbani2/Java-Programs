import java.util.Scanner;

public class AreaOfParallelogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base length of the parallelogram: ");
        double baseLength = scanner.nextDouble();

        System.out.print("Enter the height of the parallelogram: ");
        double height = scanner.nextDouble();

        double area = calculateParallelogramArea(baseLength, height);

        System.out.println("The area of the parallelogram is: " + area);
    }

    public static double calculateParallelogramArea(double baseLength, double height) {
        double area = baseLength * height;
        return area;
    }
}
