public class ThreadInterruptionExample {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            try {
                Thread.sleep(5000);
                System.out.println("Thread woke up");
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        });

        thread.start();
        thread.interrupt();
    }
}
