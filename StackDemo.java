import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("One");
        stack.push("Two");
        stack.push("Three");

        System.out.println("Stack: " + stack);

        // Removing an element
        String removedElement = stack.pop();
        System.out.println("Removed element: " + removedElement);
        System.out.println("Stack after removal: " + stack);

        // Iterating over elements
        System.out.print("Iterating over elements: ");
        for (String element : stack) {
            System.out.print(element + " ");
        }
    }
}
