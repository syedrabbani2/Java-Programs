class Counter {
    private int count = 0;

    public void increment() {
        synchronized (this) {
            count++;
            System.out.println(Thread.currentThread().getName() + " - Count: " + count);
        }
    }



    public static void main(String[] args) {
        Counter counter = new Counter();
        
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                counter.increment();
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                counter.increment();
            }
        });

        thread1.start();
        thread2.start();
    }
}
