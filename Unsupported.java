import java.util.Collections;
import java.util.List;

public class Unsupported {
    public static void main(String[] args) {
        try {
            List<String> list = Collections.singletonList("element");
            list.add("newElement"); // Attempting to modify an unmodifiable list
        } catch (UnsupportedOperationException e) {
            System.out.println("Unsupported operation exception occurred!");
        }
    }
}
