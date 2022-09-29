package sorting;

public class BinarySort {
    public static void swap(int []arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void binarySort(int []arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    swap(arr, i, j);
                }
            }
        }
    }
    public static void main(String[] args) {
        int []arr = {4,2,3,6,5,8,7,9,1};
        Print.print(arr);
        binarySort(arr);
        Print.print(arr);
        
    }
}
