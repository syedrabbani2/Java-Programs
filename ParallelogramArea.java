import java.util.Scanner;

public class ParallelogramArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the base length of the parallelogram:");
        double base = scanner.nextDouble();

        System.out.println("Enter the height of the parallelogram:");
        double height = scanner.nextDouble();

        double area = calculateParallelogramArea(base, height);

        System.out.println("The area of the parallelogram is: " + area);

        
    }

    public static double calculateParallelogramArea(double base, double height) {
        return base * height;
    }
}
