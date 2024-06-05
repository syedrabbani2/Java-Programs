import java.time.DateTimeException;
import java.time.LocalDate;

public class DateTimeExceptionHandling {
    public static void main(String[] args) {
        try {
            LocalDate date = LocalDate.of(2024, 2, 30); // Invalid date
        } catch (DateTimeException e) {
            System.out.println("Date time exception occurred!");
        }
    }
}
