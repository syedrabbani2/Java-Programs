import java.util.MissingResourceException;
import java.util.ResourceBundle;

public class MissingResourceExceptionHandling {
    public static void main(String[] args) {
        try {
            ResourceBundle bundle = ResourceBundle.getBundle("nonexistent"); // Accessing a nonexistent resource bundle
        } catch (MissingResourceException e) {
            System.out.println("Missing resource exception occurred!");
        }
    }
}
