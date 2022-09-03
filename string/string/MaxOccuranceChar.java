package string;

public class MaxOccuranceChar {
    
    public static void main(String[] args) {
        String str = "sheeshpalSinghSaini";
        // String newStr = str.toLowerCase();
        System.out.println(getMaxOccCharacter(str));

    }

    //get max occurance character
    public static char getMaxOccCharacter(String s){

        int []arr = new int[26];
        int number =0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch>='a' && ch<='z'){//lower case 
                number = ch-'a';
            }else{//upper case
                number = ch-'A';
            }
            arr[number]++;
        }
        int max = -1,ans=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
                ans = i;
            }
        }
        return (char)('a'+ans);
    }
}
