// Interface representing Comparable behavior
interface Comparable<T> {
    int compareTo(T o);
}

// Interface representing Cloneable behavior
interface Cloneable {
    Object clone() throws CloneNotSupportedException;
}

// Class representing a number implementing the Comparable interface
class Number implements Comparable<Number>, Cloneable {
    int value;

    // Constructor
    public Number(int value) {
        this.value = value;
    }

    // Implementation of compareTo method from Comparable interface
    @Override
    public int compareTo(Number o) {
        return Integer.compare(this.value, o.value);
    }

    // Implementation of clone method from Cloneable interface
    @Override
    public Object clone() throws CloneNotSupportedException {
        return new Number(this.value);
    }

    // Getter method for value
    public int getValue() {
        return value;
    }
}

// Class representing a person implementing the Cloneable interface
class Person implements Cloneable {
    private String name;

    // Constructor
    public Person(String name) {
        this.name = name;
    }

    // Implementation of clone method from Cloneable interface
    @Override
    public Object clone() throws CloneNotSupportedException {
        return new Person(this.name);
    }

    // Getter method for name
    public String getName() {
        return name;
    }
}

public class CompareToAndCloneable {
    public static void main(String[] args) {
        // Create objects of Number class
        Number num1 = new Number(10);
        Number num2 = new Number(20);

        // Compare num1 and num2
        int result = num1.compareTo(num2);
        System.out.println("Comparison result: " + result);

        // Clone num1
        try {
            Number clonedNum = (Number) num1.clone();
            System.out.println("Cloned number value: " + clonedNum.getValue());
        } catch (CloneNotSupportedException e) {
            System.out.println("Cloning not supported.");
        }

        // Create objects of Person class
        Person person1 = new Person("Alice");
        Person person2 = new Person("Bob");

        // Clone person1
        try {
            Person clonedPerson = (Person) person1.clone();
            System.out.println("Cloned person name: " + clonedPerson.getName());
        } catch (CloneNotSupportedException e) {
            System.out.println("Cloning not supported.");
        }
    }
}
