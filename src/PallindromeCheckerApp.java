public class PallindromeCheckerApp{
    public static void main(String[] args){
       String str="madam";
       boolean result=isPalindrome(str);
       System.out.println("Input Text:"+str);
        System.out.println("Is it a Palindrome?:"+result);

    }
    public static boolean isPalindrome(String str){
        int length =str.length();
        for (int i=0;i< str.length()/2;i++){
            if (str.charAt(i)!=str.charAt(length-1-i)){
                return false;
            }
        }
        return true;
    }
}
