package backtracking;

public class PrintSubsets {

    public static void printSubSets(String str,int index,String curr){
        //base case 
        if(index==str.length()){
            if(curr.length()==0){
                System.out.println("' '");
                return;
            } 
            System.out.println(curr);
            return;
        }
        //working
        printSubSets(str, index+1, curr+str.charAt(index));
        printSubSets(str, index+1, curr);
    }



    //using StringBuilder -> not working properly
    // public static void printSubSets(String str,int index,StringBuilder curr){
    //     //base case 
    //     if(index==str.length()){
    //         if(curr.length()==0){
    //             System.out.println("' '");
    //             return;
    //         }
    //         System.out.println(curr);
    //         return;
    //     }
    //     //working
    //     printSubSets(str, index+1, curr.append(str.charAt(index)));
    //     curr.delete(index,index+1);
    //     printSubSets(str, index+1, curr);
    // }
    
    public static void main(String[] args) {
        String str = "abc";
        printSubSets(str, 0,"");
    }
}
