public class PallindromeCheckerApp{
    public static boolean checkPalindrome(String str){
        int start = 0;
        int end = str.length()-1;
        while(start < end){
            if(str.charAt(start)!=str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static void main(String[] args){
        String str = "level";
        long startTime = System.nanoTime();
        boolean result = checkPalindrome(str);
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("Input: " +str);
        System.out.println("Is Palindrome?: " +result);
        System.out.println("Execution Time: " +duration+ " ns");
    }
}