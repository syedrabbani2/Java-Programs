import java.util.Scanner;

public class AreaOfRhombus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length of the first diagonal:");
        double diagonal1 = scanner.nextDouble();

        System.out.println("Enter the length of the second diagonal:");
        double diagonal2 = scanner.nextDouble();

        double area = calculateRhombusArea(diagonal1, diagonal2);

        System.out.println("The area of the rhombus is: " + area);

        
    }

    public static double calculateRhombusArea(double diagonal1, double diagonal2) {
        return diagonal1 * diagonal2 * 0.5;
    }
}
