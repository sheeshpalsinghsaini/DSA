package array;

import java.util.ArrayList;
import java.util.List;

public class ArrayInterSectoion {
    
    public static void main(String[] args) {
        
        //arrays would be sorted.
        int []arr1 = {2,4,4,5,6,7,9};
        int []arr2 = {1,3,4,4,4,5,7,8};
        List<Integer> list = new ArrayList<>();
        //intersection are the common elements.
        // for(int i=0;i<arr1.length;i++){

        //     for(int j=0;j<arr2.length;j++){
        //         if(arr1[i]==arr2[j]){
        //             list.add(arr2[j]);
        //             arr2[j] = Integer.MIN_VALUE;
        //             break;
        //         }
        //     }
        // }

        //optimise way : two pointer approach.

        int i=0,j=0;
        int n = arr1.length;
        int m = arr2.length;

        while(i<n && j<m){
            if(arr1[i]==arr2[j]){
                list.add(arr1[i]);
                i++;
                j++;
            }
            else if(arr1[i]<arr2[j])
                i++;
            else 
                j++;
        }

        for(Integer element : list){
            System.out.print(element+" ");
        }

        System.out.println();
    }
}
