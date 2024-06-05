abstract class Animal {
    abstract String eat();
    abstract String sleep();
}

class Dog extends Animal {
    @Override
    String eat() {
        return "Dog eats bones.";
    }

    @Override
    String sleep() {
        return "Dog sleeps in a doghouse.";
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        System.out.println(dog.eat());
        System.out.println(dog.sleep());
    }
}
