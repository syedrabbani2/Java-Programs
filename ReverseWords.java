public class ReverseWords {
    public static String reverseWordsInSentence(String sentence) {
        if (sentence == null || sentence.isEmpty()) {
            return "";
        }

        String[] words = sentence.split("\\s+");
        StringBuilder reversedSentence = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            reversedSentence.append(words[i]);
            if (i > 0) {
                reversedSentence.append(" ");
            }
        }

        return reversedSentence.toString();
    }

    public static void main(String[] args) {
        String inputSentence = "Hello world, how are you?";
        String reversedSentence = reverseWordsInSentence(inputSentence);
        System.out.println("Original sentence: " + inputSentence);
        System.out.println("Reversed sentence: " + reversedSentence);
    }
}
