// Interface representing Drawable behavior
interface Drawable1 {
    void draw();
}

// Interface representing Resizable behavior
interface Resizable1 {
    void resize(double factor);
}

// Class representing a shape implementing both Drawable and Resizable interfaces
class Shape1 implements Drawable, Resizable {
    private String name;

    // Constructor
    public Shape1(String name) {
        this.name = name;
    }

    // Implementation of draw method from Drawable interface
    @Override
    public void draw() {
        System.out.println("Drawing " + name);
    }

    // Implementation of resize method from Resizable interface
    @Override
    public void resize(double factor) {
        System.out.println(name + " resized by factor " + factor);
    }
}

public class ClassesAndInvokingDrawAndResize {
    public static void main(String[] args) {
        // Create objects of Shape class
        Shape rectangle = new Shape("Rectangle");
        Shape circle = new Shape("Circle");

        // Call draw method on rectangle object
        rectangle.draw();

        // Call resize method on rectangle object
        rectangle.resize(1.5);

        // Call draw method on circle object
        circle.draw();

        // Call resize method on circle object
        circle.resize(0.75);
    }
}
