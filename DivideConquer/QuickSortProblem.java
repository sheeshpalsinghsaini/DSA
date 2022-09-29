package DivideConquer;

public class QuickSortProblem {

    public static void swap(int []arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int pIndex(int []arr,int start,int end){
        int pivot = arr[end];
        int pindex = start-1;
        int i = start;

        for(;i<end;i++){
            if(arr[i]<=pivot){
                pindex++;
                swap(arr,pindex,i);
            }
        }
        swap(arr, ++pindex, end);
        return pindex;
    }

    public static void quickSort(int []arr,int start,int end){
        if(start>=end)
            return;
        int pIndex = pIndex(arr, start, end);
        quickSort(arr, start, pIndex-1);
        quickSort(arr, pIndex+1, end);
    }
    
    
    public static void main(String[] args) {
        
        int []arr = {6,5,4,7,8,3,9,1,2};
        System.out.println("----------------------------------");
        print(arr);
        quickSort(arr, 0, arr.length-1);
        print(arr);

    }

    public static void print(int []arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
