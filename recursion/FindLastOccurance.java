package recursion;

public class FindLastOccurance {
    
    public static int findLastOccurance(int []arr,int index,int key){
        if(index==-1)
            return -1;
        if(arr[index]==key)
            return index;
        return findLastOccurance(arr, index-1, key);
    }
    public static void main(String[] args) {
        
        int []arr = {8,3,6,9,5,10,2,5,3};

        System.out.println(findLastOccurance(arr, arr.length-1, 1));
    }
}
