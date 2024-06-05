class ThreadPriority extends Thread {
    public void run() {
        System.out.println("Thread name: " + Thread.currentThread().getName() +
                " Priority: " + Thread.currentThread().getPriority());
    }
}

public class ThreadPriorityExample {
    public static void main(String[] args) {
        PriorityThread thread1 = new PriorityThread();
        PriorityThread thread2 = new PriorityThread();
        
        thread1.setPriority(Thread.MIN_PRIORITY);
        thread2.setPriority(Thread.MAX_PRIORITY);
        
        thread1.start();
        thread2.start();
    }
}
