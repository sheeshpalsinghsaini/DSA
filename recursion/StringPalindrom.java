package recursion;



public class StringPalindrom {

    public static boolean checkPalindrome(String str,int start,int end){
        if(start>end)
            return true;
        if(str.charAt(start)!=str.charAt(end))
            return false;
        return checkPalindrome(str, start+1, end-1);
    }
    
    public static void main(String[] args) {
        String str = "abcba";
        System.out.println(checkPalindrome(str,0,str.length()-1));

    }


}
