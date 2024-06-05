public class UnsupportedOperationExceptionHandling {
    public static void main(String[] args) {
        try {
            java.util.List<String> list = java.util.Collections.singletonList("element");
            list.add("newElement"); // Attempting to modify an unmodifiable list
        } catch (UnsupportedOperationException e) {
            System.out.println("Unsupported operation exception occurred!");
        }
    }
}
