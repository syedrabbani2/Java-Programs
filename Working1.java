import java.util.concurrent.Phaser;

class runn implements Runnable {
    private Phaser phaser;
    private String name;

    public runn(Phaser phaser, String name) {
        this.phaser = phaser;
        this.name = name;
        phaser.register();
    }

    public void run() {
        System.out.println(name + " is working");
        phaser.arriveAndAwaitAdvance(); // Wait for all parties to arrive at this barrier point
        System.out.println(name + " finished");
        phaser.arriveAndDeregister(); // Deregister the thread from the phaser
    }
}

public class Working1 {
    public static void main(String[] args) throws InterruptedException {
        Phaser phaser = new Phaser(1); // We register the main thread

        Thread worker1 = new Thread(new runn(phaser, "Worker 1"));
        Thread worker2 = new Thread(new runn(phaser, "Worker 2"));
        Thread worker3 = new Thread(new runn(phaser, "Worker 3"));

        worker1.start();
        worker2.start();
        worker3.start();

        // Wait for all worker threads to complete
        worker1.join();
        worker2.join();
        worker3.join();

        phaser.arriveAndDeregister(); // Release the main thread
    }
}
