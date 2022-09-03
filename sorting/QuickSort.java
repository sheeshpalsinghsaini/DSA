package sorting;

public class QuickSort {
    
    public static void main(String[] args) {
        
        // int []arr = {4,7,5,8,6,9,1,3,2};
        // int []arr = {3,5,4,6,2,7,9,8,6,2,1};
        // int []arr = {1,2,3,4,5,6,7,8,9};
        int []arr = {9,8,7,6,5,4,3,2,1};


        Print.print(arr);
        System.out.println("------------------------");
        quickSort(arr, 0, arr.length-1);
        Print.print(arr);
        System.out.println();
    }

    public static void quickSort(int []arr,int start,int end){
        if(start<end){
            int pindex = pIndex(arr,start,end);
            quickSort(arr, start, pindex-1);
            quickSort(arr, pindex+1, end);
        }
    }

    public static int pIndex(int []arr,int start,int end){
        int pivot = arr[start];
        int i = start+1;
        int j = end;            //4,7,5,8,6,9,1,3,2

        while(i<=j){
            while(i<=j && arr[i]<=pivot) i++;
            while(arr[j]>pivot) j--;
            if(i<j)
                swap(arr,i,j);
        }
        // System.out.print(pivot+" ");
        swap(arr, start, j);
        return j;
        
    }

    public static void swap(int []arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
