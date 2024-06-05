// Interface representing Flyable behavior
interface Flyable {
    void fly();
}

// Interface representing Swimable behavior
interface Swimable {
    void swim();
}

// Class representing a bird implementing the Flyable interface
class Bird implements Flyable {
    private String name;

    // Constructor
    public Bird(String name) {
        this.name = name;
    }

    // Implementation of fly method from Flyable interface
    @Override
    public void fly() {
        System.out.println(name + " is flying");
    }
}

// Class representing a fish implementing the Swimable interface
class Fish implements Swimable {
    private String name;

    // Constructor
    public Fish(String name) {
        this.name = name;
    }

    // Implementation of swim method from Swimable interface
    @Override
    public void swim() {
        System.out.println(name + " is swimming");
    }
}

public class BirdAndFish {
    public static void main(String[] args) {
        // Create a Bird object
        Bird sparrow = new Bird("Sparrow");

        // Call fly method on Bird object
        sparrow.fly();

        // Create a Fish object
        Fish goldfish = new Fish("Goldfish");

        // Call swim method on Fish object
        goldfish.swim();
    }
}
