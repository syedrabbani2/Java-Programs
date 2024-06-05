
abstract class Shape1 {
    abstract double calculateArea();
    abstract double calculatePerimeter();
}

class Triangle extends Shape1 {
    double side1, side2, side3;

    Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    double calculateArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    double calculatePerimeter() {
        return side1 + side2 + side3;
    }
}

class Circle extends Shape1 {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

public class AbstractionDemo5 {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(3, 4, 5);
        Circle circle = new Circle(5);

        System.out.println("Area of Triangle: " + triangle.calculateArea());
        System.out.println("Perimeter of Triangle: " + triangle.calculatePerimeter());

        System.out.println("Area of Circle: " + circle.calculateArea());
        System.out.println("Perimeter of Circle: " + circle.calculatePerimeter());
    }
}
