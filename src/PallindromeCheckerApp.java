public class PallindromeCheckerApp{
    public static boolean isPalindrome(String str){
        int length =str.length();
        String reversed= "";
        for(int i=length-1;i>=0;i--){
            reversed+=str;
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        String str="madam";
        boolean result= isPalindrome(str);
        System.out.println("Input Text:"+str);
        System.out.println("Is it a Palindrome?:"+result);

    }
}
