public class PalindromeChecker {

    public static boolean isPalindrome(String str) {
        
        str = str.replaceAll("\\s+", "").toLowerCase();
        
        
        int left = 0;
        int right = str.length() - 1;
        
       
        while (left < right) {
            
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            
            left++;
            right--;
        }
        
        return true;
    }
    
    public static void main(String[] args) {
        String str = "A man a plan a canal Panama";
        if (isPalindrome(str)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
}
