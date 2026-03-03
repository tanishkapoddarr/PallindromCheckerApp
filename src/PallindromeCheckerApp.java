public class PallindromeCheckerApp {
    public static void main(String[] args){
        String str = "racecar";
        PalindromeService service = new PalindromeService();
        boolean result = service.checkPalindrome(str);

        System.out.println("Input : " + str);
        System.out.println("Is Palindrome? : " + result);
    }
}
class PalindromeService{
    public boolean checkPalindrome(String str) {

        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
