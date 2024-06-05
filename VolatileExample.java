public class VolatileExample {
    private static volatile boolean flag = false;

    public static void main(String[] args) {
        Thread writer = new Thread(() -> {
            flag = true;
        });

        Thread reader = new Thread(() -> {
            while (!flag) {
                // Busy wait until flag becomes true
            }
            System.out.println("Flag is now true");
        });

        writer.start();
        reader.start();
    }
}
