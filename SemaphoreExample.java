import java.util.concurrent.Semaphore;

class Work implements Runnable {
    private Semaphore semaphore;
    private String name;

    public Work(Semaphore semaphore, String name) {
        this.semaphore = semaphore;
        this.name = name;
    }

    public void run() {
        try {
            semaphore.acquire(); // Acquire a permit
            System.out.println(name + " is working");
            Thread.sleep(2000); // Simulating work
            System.out.println(name + " finished");
            semaphore.release(); // Release the permit
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class SemaphoreExample {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(2); // 2 permits available

        Thread Work1 = new Thread(new Work(semaphore, "Work 1"));
        Thread Work2 = new Thread(new Work(semaphore, "Work 2"));
        Thread Work3 = new Thread(new Work(semaphore, "Work 3"));

        Work1.start();
        Work2.start();
        Work3.start();
    }
}
