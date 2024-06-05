import java.util.Scanner;

public class AreaOfRegularPolygon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of sides of the regular polygon: ");
        int numSides = scanner.nextInt();

        System.out.print("Enter the length of each side of the regular polygon: ");
        double sideLength = scanner.nextDouble();

        double area = calculateRegularPolygonArea(numSides, sideLength);

        System.out.println("The area of the regular polygon is: " + area);
    }

    public static double calculateRegularPolygonArea(int numSides, double sideLength) {
        double area = 0.25 * numSides * sideLength * sideLength / Math.tan(Math.PI / numSides);
        return area;
    }
}
