import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Run implements Runnable {
    private String taskName;

    public Run(String string) {
		// TODO Auto-generated constructor stub
	}

	public void Task(String taskName) {
        this.taskName = taskName;
    }

    public void run() {
        System.out.println("Task " + taskName + " is being executed by " + Thread.currentThread().getName());
    }
}

public class ExecutorsExample {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        for (int i = 0; i < 5; i++) {
            Run task = new Run("Task-" + (i + 1));
            executor.execute(task);
        }

        executor.shutdown();
    }
}
