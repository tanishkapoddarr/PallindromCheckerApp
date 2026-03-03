import java.util.LinkedList;
public class PallindromeCheckerApp {
    public static boolean isPalindrome(String str) {
        LinkedList<Character> list = new LinkedList<>();
        for (char c : str.toCharArray()) {
            list.add(c);
        }
        while(list.size()>1){
            boolean b = list.getFirst() != list.getLast();
            if(b){
                return false;
            }
            list.removeFirst();
            list.removeLast();
        }
        return true;
    }
    public static void main(String[] args){
        String str = "level";
        boolean result = isPalindrome(str);
        System.out.println("Input: " +str);
        System.out.println("Is Palindrome?: " +result);
    }
}
