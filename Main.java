public class Main {
    public static void main(String[] args) {
        
        Student student1 = new Student("Ravi", 501, 22);
        
        
        System.out.println("Name: " + student1.getName());
        System.out.println("Roll Number: " + student1.getRollNumber());
        System.out.println("Age: " + student1.getAge());
        
        student1.setName("Ravi");
        student1.setRollNumber(501);
        student1.setAge(22);
        
        
        System.out.println("\nModified Details:");
        System.out.println("Name: " + student1.getName());
        System.out.println("Roll Number: " + student1.getRollNumber());
        System.out.println("Age: " + student1.getAge());
    }
}

class Studentst {
    
    private String name;
    private int rollNumber;
    private int age;

    
    public Studentst(String name, int rollNumber, int age) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.age = age;
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
