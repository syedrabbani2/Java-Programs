import java.util.Scanner;

public class CylinderVolumeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the cylinder: ");
        double radius = scanner.nextDouble();

        System.out.print("Enter the height of the cylinder: ");
        double height = scanner.nextDouble();

        double volume = calculateCylinderVolume(radius, height);
        System.out.println("The volume of the cylinder is: " + volume);
    }

    public static double calculateCylinderVolume(double radius, double height) {
        final double PI = Math.PI;
        double volume = PI * radius * radius * height;
        return volume;
    }
}
