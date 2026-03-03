import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;
public class PallindromeCheckerApp {
    public static boolean isPalindrome(String str) {
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            queue.add(c);
            stack.push(c);
        }
        while(!queue.isEmpty()){
            if(queue.remove()!=stack.pop()){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        String str = "civic";
        boolean result = isPalindrome(str);
        System.out.println("Input: " +str);
        System.out.println("Is Palindrome?: " +result);
    }
}
