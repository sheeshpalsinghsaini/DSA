package string;

public class PermutationOfString {
    
    public static void main(String[] args) {
        
    }

    public static void stringPermutation(char []str,int l,int r){
        if(l==r){
            System.out.print(str.toString()+" ");
            return ;
        }
        for(int i=l;i<=r;i++){
            str = swap(str,l,i);
            stringPermutation(str, l+1, r);
            str = swap(str,l,i);
        }
    }
    public static char[] swap(char []str,int i,int j){
        char ch = str[i];
        str[i] = str[j];
        str[j] = ch;
        return str;
    }
    
}

/*  should be present all character in each combination.
 *  abc : { abc,acb,bac,bca,cab,cba}
 * 
 *  fix : one character and exchange remaining characcter one by one.
 * 
 */
