import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class Tasker implements Runnable {
    private String TaskerName;

    public Tasker(String TaskerName) {
        this.TaskerName = TaskerName;
    }

    public void run() {
        System.out.println("Tasker " + TaskerName + " is being executed by " + Thread.currentThread().getName());
    }
}


public class ScheduledExecutorServiceExample {
    public static void main(String[] args) {
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(3);

        for (int i = 0; i < 5; i++) {
            Tasker Tasker = new Tasker("Tasker-" + (i + 1));
            executor.schedule(Tasker, 3, TimeUnit.SECONDS);
        }

        executor.shutdown();
    }
}
