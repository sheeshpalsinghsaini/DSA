package recursion;

public class RemoveDuplicate {

    public static void removeDuplicate(String str,int index,StringBuilder newStr,boolean []map){
        if(index==str.length()){
            System.out.println(newStr);
            return;
        }

        char currChar = str.charAt(index);
        if(map[currChar-'a']==true)
            removeDuplicate(str, index+1, newStr, map);
        else{
            map[currChar-'a'] = true;
            removeDuplicate(str, index+1, newStr.append(currChar), map);
        }
    }
    
    public static void main(String[] args) {
        String str = "sheeshpalsinghsaini";
        removeDuplicate(str, 0, new StringBuilder(""),new boolean[26]);

    }
}

/*
 * Remove duplicate from string.
 */
