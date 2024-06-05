import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileNotFoundExceptionHandling {
    public static void main(String[] args) {
        try {
            
            File file = new File("non_existent_file.txt");
            Scanner scanner = new Scanner(file);
            
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
            
            scanner.close();
        } catch (FileNotFoundException e) {
            
            System.out.println("Error: File not found.");
            System.out.println("Exception message: " + e.getMessage());
        }
    }
}
