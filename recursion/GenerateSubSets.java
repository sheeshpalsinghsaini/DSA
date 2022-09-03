package recursion;

import java.util.ArrayList;

public class GenerateSubSets {
    
    //generate subset of string.
    public static void generateSubsets(String str,String res,int index){
        if(str.length()==index){
            if(res.length()==0){
                System.out.print("' '"+" ");
                return;
            }
            System.out.print(res+" ");
            return;
        }
        generateSubsets(str, res, index+1);
        generateSubsets(str, res+str.charAt(index), index+1);
        
    }

    //generate subsets of array.

    public static void generateSubsetsInteger(int []arr,ArrayList<Integer> list,int index){

        if(arr.length==index){
            if(list.size()==0){
                System.out.print("' '");
                return ;
            }
            System.out.print('{');
            for(Integer data : list){
                System.out.print(" "+data+" ");
            }
            System.out.print('}');
            return;
        }
        
        generateSubsetsInteger(arr, list, index+1);      
        list.add(arr[index]);
        generateSubsetsInteger(arr, list, index+1);
    }

    public static void main(String[] args) {
        
        // String name = "abc";
        // generateSubsets(name, "", 0);
        // System.out.println();

        int []arr = {1,2,3};
        generateSubsetsInteger(arr, new ArrayList<Integer>(), 0);
        System.out.println();

    }
}
