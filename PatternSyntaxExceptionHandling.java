import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class PatternSyntaxExceptionHandling {
    public static void main(String[] args) {
        try {
            Pattern.compile("["); // Invalid regular expression pattern
        } catch (PatternSyntaxException e) {
            System.out.println("Pattern syntax exception occurred!");
        }
    }
}
