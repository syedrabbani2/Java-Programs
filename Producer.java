import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.TransferQueue;

class Producer implements Runnable {
    private TransferQueue<String> transferQueue;

    public Producer(TransferQueue<String> transferQueue) {
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

class Consumer implements Runnable {
    private TransferQueue<String> transferQueue;

    public Consumer(TransferQueue<String> transferQueue) {
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

    public static void main(String[] args) {
        TransferQueue<String> transferQueue = new LinkedTransferQueue<>();

        Thread producerThread = new Thread(new Producer(transferQueue));
        Thread consumerThread = new Thread(new Consumer(transferQueue));

        producerThread.start();
        consumerThread.start();
    }
}
