import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter the lengths of the sides of the triangle:");
        System.out.print("Side 1: ");
        double side1 = scanner.nextDouble();

        System.out.print("Side 2: ");
        double side2 = scanner.nextDouble();

        System.out.print("Side 3: ");
        double side3 = scanner.nextDouble();

 
        double semiPerimeter = (side1 + side2 + side3) / 2;


        double area = Math.sqrt(semiPerimeter * (semiPerimeter - side1) * (semiPerimeter - side2) * (semiPerimeter - side3));

  
        System.out.println("Area of the triangle is: " + area);

        
    }
}
