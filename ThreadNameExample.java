class NameThread extends Thread {
    public void run() {
        System.out.println("Thread name: " + Thread.currentThread().getName());
    }
}

public class ThreadNameExample {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            MyThread thread = new MyThread();
            thread.start();
        }
    }
}
