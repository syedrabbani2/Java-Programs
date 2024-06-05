import java.util.Scanner;

public class AreaOfSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the side length of the square:");
        double sideLength = scanner.nextDouble();

        double area = calculateSquareArea(sideLength);

        System.out.println("The area of the square with side length " + sideLength + " is: " + area);

        
    }

    public static double calculateSquareArea(double sideLength) {
        return sideLength * sideLength;
    }
}
