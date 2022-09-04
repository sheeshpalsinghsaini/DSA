package array;

public class ArraySortedOrNot {
    
    public static boolean isSorted(int []arr){
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1])
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int []arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(isSorted(arr));
        
    }
}

/*
    HP Envy X360 13
 * Acer Swift 3
 * Lenovo Legion 5 pro
 * Microsoft Surface 
 * Acer Swift x14
 * 
 * 
 */