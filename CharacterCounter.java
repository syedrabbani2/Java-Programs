public class CharacterCounter {

    public static int countOccurrences(String str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }
    
    public static void main(String[] args) {
        String str = "hello world";
        char targetChar = 'l';
        int occurrences = countOccurrences(str, targetChar);
        System.out.println("Occurrences of '" + targetChar + "' in the string: " + occurrences);
    }
}
