package string;

public class ReverString {
    
    public static void main(String[] args) {
        
        String str = "Hello";
        String result = reverseString3(str);
        System.out.println(result);

    }
    public static String reverseString(String s){
        StringBuffer sb = new StringBuffer(s);
        sb.reverse();
        return sb.toString();
    }
    public static String reverseString2(String str){
        StringBuffer sb = new StringBuffer(str);
        // char []array = str.toCharArray();
        int i=0;
        int j=sb.length()-1;

        while(i<j){
            swap(sb,i,j);
            i++;
            j--;
        }
        return sb.toString();
    }
    public static void swap(StringBuffer sb,int i,int j){
        char ch = sb.charAt(i);
        sb.setCharAt(i, sb.charAt(j));
        sb.setCharAt(j, ch);
    }
    public static void swap(char[]arr,int i,int j){
        char ch = arr[i];
        arr[i] = arr[j];
        arr[j] = ch;
    }

    public static String reverseString3(String str){
        char []array = str.toCharArray();
        int i =0;
        int j=array.length-1;

        while(i<j){
            swap(array,i,j);
            i++;j--;
        }
        return new String(str);
        
    }
}
