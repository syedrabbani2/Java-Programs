import java.io.IOException;

public class SecurityExceptionHandling {
    public static void main(String[] args) {
        try {
            System.setSecurityManager(new SecurityManager());
            Runtime.getRuntime().exec("cmd.exe"); // Attempting to execute a command
        } catch (SecurityException | IOException e) {
            System.out.println("Security exception occurred!");
        }
    }
}
