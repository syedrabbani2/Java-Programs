public class PrivateAccessingEmployee {
    public static void main(String[] args) {
        
        Employee employee = new Employee("John Doe", 101, 50000.0);
        
        
        System.out.println("Initial Details:");
        System.out.println("Name: " + employee.getName());
        System.out.println("ID: " + employee.getId());
        System.out.println("Salary: $" + employee.getSalary());

        
        employee.setSalary(55000.0);

        
        System.out.println("\nUpdated Details:");
        System.out.println("Name: " + employee.getName());
        System.out.println("ID: " + employee.getId());
        System.out.println("Salary: $" + employee.getSalary());
    }
}

class Employee1 {
   
    private String name;
    private int id;
    private double salary;

   
    public Employee1(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

   
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

   
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

   
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
