import java.util.ArrayDeque;
import java.util.Deque;
public class PallindromeCheckerApp {
    public static boolean isPalindrome(String str) {
        Deque<Character> deque = new ArrayDeque<>();
        for (char c : str.toCharArray()) {
            deque.add(c);
        }
        while(deque.size()>1){
            boolean b = deque.getFirst() != deque.getLast();
            if(b){
                return false;
            }
            deque.removeFirst();
            deque.removeLast();
        }
        return true;
    }
    public static void main(String[] args){git status
        String str = "refer";
        boolean result = isPalindrome(str);
        System.out.println("Input: " +str);
        System.out.println("Is Palindrome?: " +result);
    }
}