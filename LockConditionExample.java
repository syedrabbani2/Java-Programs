import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class SharedResource {
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();
    private boolean isDataReady = false;

    public void produce() {
        lock.lock();
        try {
            while (isDataReady) {
                condition.await();
            }
            System.out.println("Producing data...");
            isDataReady = true;
            condition.signal();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void consume() {
        lock.lock();
        try {
            while (!isDataReady) {
                condition.await();
            }
            System.out.println("Consuming data...");
            isDataReady = false;
            condition.signal();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}

public class LockConditionExample {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();

        Thread producerThread = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                sharedResource.produce();
            }
        });

        Thread consumerThread = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                sharedResource.consume();
            }
        });

        producerThread.start();
        consumerThread.start();
    }
}
