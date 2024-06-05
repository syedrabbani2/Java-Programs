public class PrivateAccessingRectangle {
    public static void main(String[] args) {
 
        Rectangle rectangle = new Rectangle(5.0, 3.0);
        
 
        System.out.println("Initial Details:");
        System.out.println("Length: " + rectangle.getLength());
        System.out.println("Width: " + rectangle.getWidth());
        System.out.println("Area: " + rectangle.getArea());

 
        rectangle.setLength(7.0);

 
        System.out.println("\nUpdated Details:");
        System.out.println("Length: " + rectangle.getLength());
        System.out.println("Width: " + rectangle.getWidth());
        System.out.println("Area: " + rectangle.getArea());
    }
}

class Rectangle1 {
    
    private double length;
    private double width;
    private double area;

 
    public Rectangle1(double length, double width) {
        this.length = length;
        this.width = width;
        this.area = calculateArea();
    }

 
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
 
        this.area = calculateArea();
    }

 
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
 
        this.area = calculateArea();
    }

 
    public double getArea() {
        return area;
    }

 
    private double calculateArea() {
        return length * width;
    }
}
