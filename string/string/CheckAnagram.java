package string;

import java.util.Arrays;

public class CheckAnagram {
    
    public static void main(String[] args) {
        
    }

    //method 1 sort both and check each character

    public static boolean checkAnagram(char []str1,char []str2){
        int n1 = str1.length;
        int n2 = str2.length;

        if(n1!=n2)
            return false;

        //sort them
        Arrays.sort(str1);
        Arrays.sort(str2);

        for(int i=0;i<str1.length;i++){
            if(str1[i]!=str2[i])
                return false;
        }
        return true;
    }

    // method 2, take a count array & count character for str1 and decrease count for str2
    //if count would be 0 then it will be anagram.

    public static boolean checkAnagram2(char []str1,char []str2){
        int n1 = str2.length;
        int n2 = str1.length;
        if(n1!=n2)
            return false;
        int []count = new int[26];

        for(int i=0;i<n1;i++){
            count[str1[i]-'a']++;
        }
        for(int j=0;j<n2;j++){
            count[str2[j]-'a']--;
        }
        for(int i=0;i<count.length;i++){
            if(count[i]!=0)
                return false;
        }
        return true;
    }


}
/*
 * An anagram of a string is another string that contains 
 * the same characters, only the order of characters can be different. 
 * For example, “abcd” and “dabc” 
 */