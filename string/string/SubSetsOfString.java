package string;

public class SubSetsOfString {
    
    public static void main(String[] args) {
        String str = "abc";
        printSubsets(str, "", 0);
    }
    public static void printSubsets(String str,String curr,int index){
        if(index == str.length()){
            if(curr.length()==0){
                System.out.println("' '"); return ;
            }
            System.out.print(curr+" ");
            return;
        }

        printSubsets(str, curr+str.charAt(index), index+1);     //include character.
        printSubsets(str, curr, index+1);                       //not include character.
    }
}

/* Subsequence/subsets
 * str = "abc"
 * op: {" ",a,b,c,ab,bc,ac,abc};
 * include or not include.
 * 
 * 
 * 
 * 
 */
