import java.util.concurrent.*;

public class CallableFutureExample {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        Callable<Integer> task = () -> {
            Thread.sleep(2000);
            return ThreadLocalRandom.current().nextInt(1, 100);
        };

        Future<Integer> future1 = executor.submit(task);
        Future<Integer> future2 = executor.submit(task);
        Future<Integer> future3 = executor.submit(task);

        System.out.println("Result from future1: " + future1.get());
        System.out.println("Result from future2: " + future2.get());
        System.out.println("Result from future3: " + future3.get());

        executor.shutdown();
    }
}
