
interface Drawable {
    void draw();
}


interface Resizable {
    void resize(double factor);
}

class Shape implements Drawable, Resizable {
    private String name;

    // Constructor
    public Shape(String name) {
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

public class Main {
    public static void main(String[] args) {
        // Create a Shape object
        Shape shape = new Shape("Rectangle");

        // Call draw method
        shape.draw();

        // Call resize method
        shape.resize(1.5);
    }
}
