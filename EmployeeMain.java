abstract class Employee {
    abstract double calculateSalary();
    abstract double calculateBonus();
}

class Manager extends Employee {
    @Override
    double calculateSalary() {
        // Implement manager's salary calculation
        return 5000; // Example value
    }

    @Override
    double calculateBonus() {
        // Implement manager's bonus calculation
        return 1000; // Example value
    }
}

class Clerk extends Employee {
    @Override
    double calculateSalary() {
        // Implement clerk's salary calculation
        return 2500; // Example value
    }

    @Override
    double calculateBonus() {
        // Implement clerk's bonus calculation
        return 500; // Example value
    }
}

public class EmployeeMain {
    public static void main(String[] args) {
        Manager manager = new Manager();
        System.out.println("Manager Salary: $" + manager.calculateSalary());
        System.out.println("Manager Bonus: $" + manager.calculateBonus());

        Clerk clerk = new Clerk();
        System.out.println("Clerk Salary: $" + clerk.calculateSalary());
        System.out.println("Clerk Bonus: $" + clerk.calculateBonus());
    }
}
