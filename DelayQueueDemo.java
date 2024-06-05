import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

class DelayedElement implements Delayed {
    private long delayTime;
    private long expireTime;

    public DelayedElement(long delay) {
        this.delayTime = delay;
        this.expireTime = System.currentTimeMillis() + delay;
    }

    @Override
    public long getDelay(TimeUnit unit) {
        long diff = expireTime - System.currentTimeMillis();
        return unit.convert(diff, TimeUnit.MILLISECONDS);
    }

    @Override
    public int compareTo(Delayed o) {
        return Long.compare(this.expireTime, ((DelayedElement)o).expireTime);
    }
}

public class DelayQueueDemo {
    public static void main(String[] args) throws InterruptedException {
        DelayQueue<DelayedElement> queue = new DelayQueue<>();

        // Adding elements
        queue.put(new DelayedElement(2000));
        queue.put(new DelayedElement(1000));
        queue.put(new DelayedElement(3000));

        // Retrieving elements
        while (!queue.isEmpty()) {
            DelayedElement element = queue.take();
            System.out.println("Retrieved element after " + element.getDelay(TimeUnit.MILLISECONDS) + " milliseconds.");
        }
    }
}
