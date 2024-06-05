import java.util.concurrent.Exchanger;

class FirstThread implements Runnable {
    private Exchanger<String> exchanger;

    public FirstThread(Exchanger<String> exchanger) {
        this.exchanger = exchanger;
    }

    public void run() {
        try {
            String message = "Hello from FirstThread";
            System.out.println("FirstThread sends: " + message);
            String receivedMessage = exchanger.exchange(message);
            System.out.println("FirstThread received: " + receivedMessage);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class SecondThread implements Runnable {
    private Exchanger<String> exchanger;

    public SecondThread(Exchanger<String> exchanger) {
        this.exchanger = exchanger;
    }

    public void run() {
        try {
            String message = "Hello from SecondThread";
            System.out.println("SecondThread sends: " + message);
            String receivedMessage = exchanger.exchange(message);
            System.out.println("SecondThread received: " + receivedMessage);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class ExchangerExample {
    public static void main(String[] args) {
        Exchanger<String> exchanger = new Exchanger<>();

        Thread firstThread = new Thread(new FirstThread(exchanger));
        Thread secondThread = new Thread(new SecondThread(exchanger));

        firstThread.start();
        secondThread.start();
    }
}
