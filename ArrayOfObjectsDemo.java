class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class ArrayOfObjectsDemo {
    public static void main(String[] args) {
        
        Student[] students = new Student[3];
        
        students[0] = new Student("Alice", 20);
        students[1] = new Student("Bob", 21);
        students[2] = new Student("Charlie", 22);

        
        for (int i = 0; i < students.length; i++) {
            System.out.println("Student " + (i + 1) + ":");
            System.out.println("Name: " + students[i].getName());
            System.out.println("Age: " + students[i].getAge());
            System.out.println();
        }
    }
}
