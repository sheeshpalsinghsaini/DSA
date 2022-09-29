package sorting;

public class QuickSort {
    public static void swap(int []arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    //method for find pivot 
    public static int pIndex(int []arr,int start,int end){
        int pivot = arr[start];
        int i = start+1;
        int j= end;

        while(i<=j){
            while(i<=j && arr[i]<=pivot) i++;
            while(arr[j]>pivot) j--;
            if(i<j)
                swap(arr,i,j);
        }
        
        swap(arr, start, j);
        return j;
    }

    //quick sort mehtod
    public static void quickSort(int []arr,int start,int end){
        if(start<end){
            int pindex = pIndex(arr,start,end);
            quickSort(arr, start, pindex-1);
            quickSort(arr, pindex+1, end);
        }
    }
    
    public static void main(String[] args) {
        int []arr = {4,2,3,6,5,8,7,9,1};
        Print.print(arr);
        quickSort(arr, 0, arr.length-1);
        Print.print(arr);
        
    }
}
