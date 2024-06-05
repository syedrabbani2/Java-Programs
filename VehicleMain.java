abstract class Vehicle {
    abstract void start();
    abstract void stop();
}

class Car extends Vehicle {
    void start() {
        System.out.println("Starting the car...");
    }

    void stop() {
        System.out.println("Stopping the car...");
    }
}

class Motorcycle extends Vehicle {
    void start() {
        System.out.println("Starting the motorcycle...");
    }

    void stop() {
        System.out.println("Stopping the motorcycle...");
    }
}

public class VehicleMain {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle motorcycle = new Motorcycle();

        // Invoking abstract methods
        car.start();
        car.stop();

        motorcycle.start();
        motorcycle.stop();
    }
}
