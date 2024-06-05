// Interface representing Flyable behavior
interface Flyable1 {
    void fly();
}

// Interface representing Swimable behavior
interface Swimable1 {
    void swim();
}

// Class representing a bird implementing the Flyable interface
class Bird1 implements Flyable1 {
    private String name;

    // Constructor
    public Bird1(String name) {
        this.name = name;
    }

    // Implementation of fly method from Flyable interface
    @Override
    public void fly() {
        System.out.println(name + " is flying");
    }
}

// Class representing a fish implementing the Swimable interface
class Fish1 implements Swimable {
    private String name;

    // Constructor
    public Fish1(String name) {
        this.name = name;
    }

    // Implementation of swim method from Swimable interface
    @Override
    public void swim() {
        System.out.println(name + " is swimming");
    }
}

public class BirdAndFish2 {
    public static void main(String[] args) {
        // Create objects of Bird class
        Bird sparrow = new Bird("Sparrow");

        // Call fly method on Bird object
        sparrow.fly();

        // Create objects of Fish class
        Fish goldfish = new Fish("Goldfish");

        // Call swim method on Fish object
        goldfish.swim();
    }
}
