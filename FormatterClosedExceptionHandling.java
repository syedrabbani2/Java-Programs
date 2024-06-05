import java.util.Formatter;
import java.util.FormatterClosedException;

public class FormatterClosedExceptionHandling {
    public static void main(String[] args) {
        try {
            Formatter formatter = new Formatter();
            formatter.close();
            formatter.format("Hello"); // Attempting to format after closing
        } catch (FormatterClosedException e) {
            System.out.println("Formatter closed exception occurred!");
        }
    }
}
