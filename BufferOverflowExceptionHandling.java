import java.nio.ByteBuffer;
import java.nio.BufferOverflowException;

public class BufferOverflowExceptionHandling {
    public static void main(String[] args) {
        try {
            ByteBuffer buffer = ByteBuffer.allocate(5);
            buffer.putInt(10); // Attempting to put more data than buffer capacity
        } catch (BufferOverflowException e) {
            System.out.println("Buffer overflow exception occurred!");
        }
    }
}
