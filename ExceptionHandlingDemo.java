import java.io.*;

public class ExceptionHandlingDemo {

    public static void main(String[] args) {
        handleArrayIndexOutOfBoundsException();
        handleArithmeticException();
        handleNullPointerException();
        handleFileNotFoundException();
        handleNumberFormatException();
        handleArithmeticException();
    }

    // 1. Handling ArrayIndexOutOfBoundsException
    public static void handleArrayIndexOutOfBoundsException() {
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[3]); // Trying to access an index out of bounds
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        }
    }

    // 2. Handling ArithmeticException
    public static void handleArithmeticException() {
        try {
            int result = 10 / 0; // Trying to divide by zero
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        }
    }

    // 3. Handling NullPointerException
    public static void handleNullPointerException() {
        try {
            String str = null;
            System.out.println(str.length()); // Trying to access length of a null string
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught: " + e.getMessage());
        }
    }

    // 4. Handling FileNotFoundException
    public static void handleFileNotFoundException() {
        try {
            FileReader file = new FileReader("nonexistentfile.txt"); // Trying to access a non-existent file
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException caught: " + e.getMessage());
        }
    }

    // 5. Handling NumberFormatException
    public static void handleNumberFormatException() {
        try {
            int num = Integer.parseInt("abc"); // Trying to parse a non-integer string
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught: " + e.getMessage());
        }
    }
}

    // 6
