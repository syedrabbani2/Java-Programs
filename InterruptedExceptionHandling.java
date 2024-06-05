public class InterruptedExceptionHandling {
    public static void main(String[] args) {
       
        Thread thread = new Thread(new MyRunnable());

        
        thread.start();

        
        try {
            Thread.sleep(2000); 
            thread.interrupt(); 
        } catch (InterruptedException e) {
            
            System.out.println("Main thread interrupted: " + e.getMessage());
        }
    }

 
    static class MyRunnable implements Runnable {
        @Override
        public void run() {
            try {
                
                while (!Thread.currentThread().isInterrupted()) {
                    System.out.println("Running...");
                    Thread.sleep(500); 
                }
            } catch (InterruptedException e) {
                
                System.out.println("Thread interrupted: " + e.getMessage());
            }
        }
    }
}
