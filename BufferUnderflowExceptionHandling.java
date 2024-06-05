import java.nio.ByteBuffer;
import java.nio.BufferUnderflowException;

public class BufferUnderflowExceptionHandling {
    public static void main(String[] args) {
        try {
            ByteBuffer buffer = ByteBuffer.allocate(5);
            buffer.getInt(); // Attempting to get data when buffer is empty
        } catch (BufferUnderflowException e) {
            System.out.println("Buffer underflow exception occurred!");
        }
    }
}
