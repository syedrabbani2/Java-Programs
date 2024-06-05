

abstract class Figure {
    abstract void draw();
    abstract void erase();
}

class Rectangle extends Figure {
    void draw() {
        System.out.println("Drawing rectangle");
    }
    void erase() {
        System.out.println("Erasing rectangle");
    }
}

class Circle1 extends Figure {
    void draw() {
        System.out.println("Drawing circle");
    }
    void erase() {
        System.out.println("Erasing circle");
    }
}

public class FigureMqin {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Circle circle1 = new Circle();

        rectangle.draw();
        rectangle.erase();

        circle1.draw();
        circle1.erase();
    }
}
