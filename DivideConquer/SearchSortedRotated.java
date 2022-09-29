package DivideConquer;

public class SearchSortedRotated {
    
    public static int searchSortedRotatedArray(int []arr,int target,int start,int end){

        //base case :
        if(start>end)
            return -1;

        //process
        int mid = start + (end-start)/2;
        if(arr[mid]==target)
            return mid;
        
        //search in L1
        if(arr[start]<=arr[mid]){
            //case 1: search in left
            if(arr[start]<=target && target<=arr[mid])
                return searchSortedRotatedArray(arr, target, start, mid-1);
            //case 2: search in right
            else
                return searchSortedRotatedArray(arr, target, mid+1, end);
        }

        //search in L2
        else{
            //case d : right side 
            if(arr[mid]<=target && target<=arr[end])
                return searchSortedRotatedArray(arr, target, mid+1, end);
            //case c : left side 
            else
                return searchSortedRotatedArray(arr, target, start, mid-1);
        }
    }
    public static void main(String[] args) {
        
        int []arr = {4,5,6,7,8,9,0,1,2,3};

        int index = searchSortedRotatedArray(arr, 2, 0, arr.length-1);
        System.out.println(index);
    }
}
