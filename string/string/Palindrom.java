package string;

public class Palindrom {
    public static void main(String[] args) {
        String str = "madam";
        System.out.println(palindrom(str));
    }
    public static boolean palindrom(String str){
        int i=0;
        int j=str.length()-1;

        while(i<j){
            if(str.charAt(i)!=str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}
