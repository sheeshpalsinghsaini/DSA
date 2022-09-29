package sorting;

public class InsertionSort {
 
    public static void insertionSort(int []arr){
        for(int i=1;i<arr.length;i++){
            int temp = arr[i];
            int j=i-1;

            while(j>-1 && arr[j]>temp){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
    }
    public static void main(String[] args) {
        int []arr = {4,2,3,6,5,8,7,9,1};
        Print.print(arr);
        insertionSort(arr);
        Print.print(arr);
    }
}
