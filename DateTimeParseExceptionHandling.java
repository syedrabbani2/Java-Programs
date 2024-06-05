import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class DateTimeParseExceptionHandling {
    public static void main(String[] args) {
        try {
            LocalDate date = LocalDate.parse("2024-02-30"); // Parsing an invalid date
        } catch (DateTimeParseException e) {
            System.out.println("Date time parse exception occurred!");
        }
    }
}
