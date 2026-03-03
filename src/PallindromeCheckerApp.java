import java.util.Stack;
public class PallindromeCheckerApp {
    public static void main(String[] args){
        String str = "level";
        PalindromeStrategy service = new StackStrategy();
        boolean result = service.check(str);

        System.out.println("Input : " + str);
        System.out.println("Is Palindrome? : " + result);
    }
}
interface PalindromeStrategy{
    public boolean check(String str);
}
class StackStrategy implements PalindromeStrategy {

    @Override
    public boolean check(String input) {
        if (input == null) return false;

        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            stack.push(c);
        }
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }
        return true;
    }
}