public class ASCIIFinder {

    public static int findASCIIValue(char character) {
        return (int) character; 
    }

    public static void main(String[] args) {
        char character = 'A'; 
        int asciiValue = findASCIIValue(character);
        System.out.println("ASCII value of '" + character + "' is: " + asciiValue);
    }
}
