public class CapitalizeFirstLetter {
    public static String capitalizeFirstLetterOfWords(String sentence) {
        if (sentence == null || sentence.isEmpty()) {
            return "";
        }

        String[] words = sentence.split("\\s+");
        StringBuilder capitalizedSentence = new StringBuilder();

        for (String word : words) {
            if (word.length() > 0) {
                char firstChar = Character.toUpperCase(word.charAt(0));
                capitalizedSentence.append(firstChar).append(word.substring(1)).append(" ");
            }
        }

        return capitalizedSentence.toString().trim();
    }

    public static void main(String[] args) {
        String inputSentence = "hello world, how are you?";
        String capitalizedSentence = capitalizeFirstLetterOfWords(inputSentence);
        System.out.println("Original sentence: " + inputSentence);
        System.out.println("Capitalized sentence: " + capitalizedSentence);
    }
}
