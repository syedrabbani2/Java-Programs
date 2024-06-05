class ObjectCounter {
    
    private static int objectCount = 0;

    
    public ObjectCounter() {
        objectCount++;
    }

 
    public static int getObjectCount() {
        return objectCount;
    }
}

public class MainObjectCounter {
    public static void main(String[] args) {
       
        ObjectCounter obj1 = new ObjectCounter();
        ObjectCounter obj2 = new ObjectCounter();
        ObjectCounter obj3 = new ObjectCounter();

       
        int count = ObjectCounter.getObjectCount();
        System.out.println("Number of objects created: " + count);
    }
}
