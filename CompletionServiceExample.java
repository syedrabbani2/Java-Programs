import java.util.concurrent.*;

class Service implements Callable<String> {
    private int ServiceId;

    public Service(int ServiceId) {
        this.ServiceId = ServiceId;
    }

    public String call() {
        return "Service-" + ServiceId + " completed";
    }
}

public class CompletionServiceExample {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        CompletionService<String> completionService = new ExecutorCompletionService<>(executor);

        for (int i = 1; i <= 5; i++) {
            completionService.submit(new Service(i));
        }

        for (int i = 0; i < 5; i++) {
            Future<String> future = completionService.take();
            System.out.println(future.get());
        }

        executor.shutdown();
    }
}
