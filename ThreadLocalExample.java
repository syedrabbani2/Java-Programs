public class ThreadLocalExample {
    public static ThreadLocal<Integer> threadLocal = new ThreadLocal<>();

    public static void main(String[] args) {
        threadLocal.set(10);

        Thread thread1 = new Thread(() -> {
            threadLocal.set(20);
            System.out.println("Thread 1 - Value: " + threadLocal.get());
        });

        Thread thread2 = new Thread(() -> {
            System.out.println("Thread 2 - Value: " + threadLocal.get());
        });

        thread1.start();
        thread2.start();
    }
}
