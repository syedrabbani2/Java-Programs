import java.util.Scanner;

public class VolumeOfCylinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the radius of the cylinder:");
        double radius = scanner.nextDouble();

        System.out.println("Enter the height of the cylinder:");
        double height = scanner.nextDouble();

        double volume = Math.PI * Math.pow(radius, 2) * height;

        System.out.println("The volume of the cylinder with radius " + radius + " and height " + height + " is: " + volume);

       
    }
}
