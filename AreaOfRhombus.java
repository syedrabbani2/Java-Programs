import java.util.Scanner;

public class AreaOfRhombus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the diagonals of the rhombus: ");
        double diagonal1 = scanner.nextDouble();
        double diagonal2 = scanner.nextDouble();

        double area = calculateRhombusArea(diagonal1, diagonal2);

        System.out.println("The area of the rhombus is: " + area);
    }

    public static double calculateRhombusArea(double d1, double d2) {
        double area = (d1 * d2) / 2;
        return area;
    }
}
