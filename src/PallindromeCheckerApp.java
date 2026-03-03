import java.util.Stack;
public class PallindromeCheckerApp {
    public static boolean isPalindrome(String str) {
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            stack.push(c);
        }
        for( char c : str.toCharArray()){
            if(stack.pop()!=c){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        String str = "noon";
        boolean result = isPalindrome(str);
        System.out.println("Input: " +str);
        System.out.println("Is Palindrome?: " +result);
    }
}
