public class PrivateAccessingcircle {
    public static void main(String[] args) {
        
        Circle circle = new Circle(5.0);
        
        
        System.out.println("Initial Details:");
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Area: " + circle.getArea());
        System.out.println("Circumference: " + circle.getCircumference());

        
        circle.setRadius(7.0);

        
        System.out.println("\nUpdated Details:");
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Area: " + circle.getArea());
        System.out.println("Circumference: " + circle.getCircumference());
    }
}

class Circle1 {
    
    private double radius;
    private double area;
    private double circumference;

    
    public Circle1(double radius) {
        this.radius = radius;
        this.area = calculateArea();
        this.circumference = calculateCircumference();
    }

    
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    
        this.area = calculateArea();
        this.circumference = calculateCircumference();
    }

    
    public double getArea() {
        return area;
    }

    
    public double getCircumference() {
        return circumference;
    }

    
    private double calculateArea() {
        return Math.PI * radius * radius;
    }

    
    private double calculateCircumference() {
        return 2 * Math.PI * radius;
    }
}
