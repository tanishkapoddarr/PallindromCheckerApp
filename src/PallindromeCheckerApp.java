public class PallindromeCheckerApp {
    public static boolean isPalindrome(String text){
        String normalized = text.replaceAll("\\s+", "").toLowerCase();
        int length = normalized.length();
        for (int i = 0; i < length/2; i++){
            if(normalized.charAt(i) != normalized.charAt(length-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        String text= "A man a plan a canal Panama";
        boolean result = isPalindrome(text);
        System.out.println("Input: " +text);
        System.out.println("Is Palindrome?: " +result);
    }
}
