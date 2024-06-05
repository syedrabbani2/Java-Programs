import java.util.concurrent.CountDownLatch;

class Workerr implements Runnable {
    private CountDownLatch latch;
    private String name;

    public Workerr(CountDownLatch latch, String name) {
        this.latch = latch;
        this.name = name;
    }

    public void run() {
        System.out.println(name + " is working");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name + " finished");
        latch.countDown();
    }


 
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch latch = new CountDownLatch(3);

        Thread Workerr1 = new Thread(new Workerr(latch, "Workerr 1"));
        Thread Workerr2 = new Thread(new Workerr(latch, "Workerr 2"));
        Thread Workerr3 = new Thread(new Workerr(latch, "Workerr 3"));

        Workerr1.start();
        Workerr2.start();
        Workerr3.start();

        latch.await();
        System.out.println("All Workerrs have finished their tasks");
    }
}
