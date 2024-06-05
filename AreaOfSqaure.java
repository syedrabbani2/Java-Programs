import java.util.Scanner;

public class AreaOfSqaure {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the side length of the square: ");
        double sideLength = scanner.nextDouble();

        double area = calculateSquareArea(sideLength);

        System.out.println("The area of the square is: " + area);
    }

    public static double calculateSquareArea(double sideLength) {
        double area = sideLength * sideLength;
        return area;
    }
}
