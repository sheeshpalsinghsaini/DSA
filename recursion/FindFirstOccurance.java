package recursion;

public class FindFirstOccurance {
    
    public static int findFirstOccurance(int []arr,int index,int key){
        if(index==arr.length-1)
            return -1;
        if(arr[index]==key)
            return index;
        return findFirstOccurance(arr, index+1, key);
    }
    public static void main(String[] args) {
        int []arr = {8,3,6,9,5,10,2,5,3};
        System.out.println("----------------------------------------");
        System.out.println(findFirstOccurance(arr, 0, 1));
    }
}

/*
 * find first occurance in an array
 */
