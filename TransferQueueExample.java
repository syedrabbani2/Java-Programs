import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.TransferQueue;

class Leader implements Runnable {
    private TransferQueue<String> transferQueue;

    public Leader(TransferQueue<String> transferQueue) {
        this.transferQueue = transferQueue;
    }

    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                transferQueue.transfer("Message " + i);
                System.out.println("Produced: Message " + i);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Customer implements Runnable {
    private TransferQueue<String> transferQueue;

    public Customer(TransferQueue<String> transferQueue) {
        this.transferQueue = transferQueue;
    }

    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                String message = transferQueue.take();
                System.out.println("Consumed: " + message);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class TransferQueueExample {
    public static void main(String[] args) {
        TransferQueue<String> transferQueue = new LinkedTransferQueue<>();

        Thread LeaderThread = new Thread(new Leader(transferQueue));
        Thread CustomerThread = new Thread(new Customer(transferQueue));

        LeaderThread.start();
        CustomerThread.start();
    }
}
