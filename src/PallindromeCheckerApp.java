public class PallindromeCheckerApp {
    public static boolean isPalindrome(String str) {
        char[] chars = str.toCharArray();
        int start = 0;
        int end = chars.length - 1;
        while (start < end) {
            if (chars[start] != chars[end]) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static void main(String[] args){
        String str = "radar";
        boolean result = isPalindrome(str);
        System.out.println("Input: " +str);
        System.out.println("Is Palindrome?: " +result);
    }
}
