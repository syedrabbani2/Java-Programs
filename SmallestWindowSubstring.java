import java.util.HashMap;
import java.util.Map;

public class SmallestWindowSubstring {
    public static String findSmallestWindow(String str, String pattern) {
        if (str == null || pattern == null || str.length() < pattern.length()) {
            return "";
        }

        
        Map<Character, Integer> patternMap = new HashMap<>();
        for (char ch : pattern.toCharArray()) {
            patternMap.put(ch, patternMap.getOrDefault(ch, 0) + 1);
        }

        int left = 0; 
        int minWindowLength = Integer.MAX_VALUE;
        int minWindowStart = 0;
        int matched = 0; 

        
        for (int right = 0; right < str.length(); right++) {
            char rightChar = str.charAt(right);

            
            if (patternMap.containsKey(rightChar)) {
                patternMap.put(rightChar, patternMap.get(rightChar) - 1);
                if (patternMap.get(rightChar) >= 0) {
                    matched++;
                }
            }

            
            while (matched == pattern.length()) {
                
                if (right - left + 1 < minWindowLength) {
                    minWindowLength = right - left + 1;
                    minWindowStart = left;
                }

                char leftChar = str.charAt(left);
                
                if (patternMap.containsKey(leftChar)) {
                    patternMap.put(leftChar, patternMap.get(leftChar) + 1);
                    if (patternMap.get(leftChar) > 0) {
                        matched--;
                    }
                }
                left++;
            }
        }

        
        return minWindowLength == Integer.MAX_VALUE ? "" : str.substring(minWindowStart, minWindowStart + minWindowLength);
    }

    public static void main(String[] args) {
        String str = "ACHDGASDCGIUDA";
        String pattern = "ABC";
        String smallestWindow = findSmallestWindow(str, pattern);
        if (!smallestWindow.isEmpty()) {
            System.out.println("Smallest window containing all characters of pattern \"" + pattern + "\": " + smallestWindow);
        } else {
            System.out.println("No window found containing all characters of pattern \"" + pattern + "\" in the string \"" + str + "\"");
        }
    }
}
