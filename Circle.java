public class Circle {

    public static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static double calculatePerimeter(double radius) {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        double radius = 5.0; 
        
        
        double area = calculateArea(radius);
        System.out.println("Area of the circle: " + area);

        
        double perimeter = calculatePerimeter(radius);
        System.out.println("Perimeter of the circle: " + perimeter);
    }
}
