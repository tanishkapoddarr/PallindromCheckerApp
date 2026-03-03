public class PallindromeCheckerApp {
    private static boolean check(String str, int start, int end){
        while (start < end){
            if(str.charAt(start)!=str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static void main(String[] args){
        String str = "madam";
        boolean result = check(str,0,str.length()-1);
        System.out.println("Input: " +str);
        System.out.println("Is Palindrome?: " +result);
    }
}