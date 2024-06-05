import java.util.ArrayDeque;

public class IllegalStateExceptionHandling {
    public static void main(String[] args) {
        try {
            ArrayDeque<Integer> deque = new ArrayDeque<>();
            deque.removeFirst(); // Removing from empty deque
        } catch (IllegalStateException e) {
            System.out.println("Illegal state exception occurred!");
        }
    }
}
