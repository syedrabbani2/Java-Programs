import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task implements Runnable {
    private String taskName;

    public Task(String taskName) {
        this.taskName = taskName;
    }

    public void run() {
        System.out.println("Task " + taskName + " is being executed by " + Thread.currentThread().getName());
    }



    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        for (int i = 0; i < 5; i++) {
            Task task = new Task("Task-" + (i + 1));
            executor.execute(task);
        }

        executor.shutdown();
    }
}
