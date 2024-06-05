import java.util.Scanner;

public class AreaOfRegularPolygon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of sides of the regular polygon:");
        int n = scanner.nextInt();

        System.out.println("Enter the length of each side of the regular polygon:");
        double s = scanner.nextDouble();

        double area = calculateRegularPolygonArea(n, s);

        System.out.println("The area of the regular polygon is: " + area);

        
    }

    public static double calculateRegularPolygonArea(int n, double s) {
        return (n * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / n));
    }
}
