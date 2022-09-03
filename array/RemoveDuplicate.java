package array;

public class RemoveDuplicate {
    
    //naive solution
    
    public static int removeDuplicate(int []arr){
        int []temp = new int[arr.length];
        temp[0] = arr[0];
        int res = 1;
        for(int i=1;i<arr.length;i++){
            if(temp[res-1]!=arr[i])
                temp[res++]=arr[i];
        }
        for(int i=0;i<res;i++){
            arr[i] = temp[i];
        }
        return res;
    }

    //efficient solution 
    public static int removeDuplicate2(int []arr){
        int res = 1;
        
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[res-1])
                arr[res++]=arr[i];
        }
        return res;
    }
    public static void main(String[] args) {
        int []arr = {10,20,20,30,30,30};
        print(arr, arr.length);
        int size = removeDuplicate2(arr);
        print(arr, size);
    }

    public static void print(int[]arr,int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
/*
 * 1. naive solution
 *      take a temp array and copy distinct element
 *      and again copy these distinct element in original and return distinct elelement len.
 * 
 * 2. efficient solution :
 *  
 */