public class CharacterOccurrence {
    public static void main(String[] args) {
        String str = "Hello, world!";
        char searchChar = 'o';

        int count = countOccurrences(str, searchChar);

        System.out.println("Occurrences of '" + searchChar + "' in the string: " + count);
    }

    
    public static int countOccurrences(String str, char searchChar) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == searchChar) {
                count++;
            }
        }
        return count;
    }
}
