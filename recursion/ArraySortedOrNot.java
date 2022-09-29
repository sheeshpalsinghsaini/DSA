package recursion;

public class ArraySortedOrNot {

    public static boolean isSorted(int []arr,int n){
        if(n==1)
            return true;
        return arr[n-1]<arr[n] && isSorted(arr, n-1);
    }
    
    public static void main(String[] args) {
        
        int []arr = {1,2,3,12,5,6,7,8,9};
        boolean isSorted = isSorted(arr, arr.length-1);
        System.out.println(isSorted);
    }
}
