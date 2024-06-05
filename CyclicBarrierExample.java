import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

class Worker implements Runnable {
    private CyclicBarrier barrier;
    private String name;

    public Worker(CyclicBarrier barrier, String name) {
        this.barrier = barrier;
        this.name = name;
    }

    public void run() {
        System.out.println(name + " is working");
        try {
            barrier.await(); // Wait for all threads to reach this barrier point
        } catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }
        System.out.println(name + " finished");
    }
}

public class CyclicBarrierExample {
    public static void main(String[] args) {
        final int parties = 3;
        CyclicBarrier barrier = new CyclicBarrier(parties, () -> {
            System.out.println("All workers have reached the barrier");
        });

        Thread worker1 = new Thread(new Worker(barrier, "Worker 1"));
        Thread worker2 = new Thread(new Worker(barrier, "Worker 2"));
        Thread worker3 = new Thread(new Worker(barrier, "Worker 3"));

        worker1.start();
        worker2.start();
        worker3.start();
    }
}
