package sorting;

public class SelectionSort {
    
    public static void main(String[] args) {
        
        int []arr = {6,8,3,5,9,2,7,1};
        Print.print(arr);
        System.out.println("-------------------");
        selectionSort(arr);
        Print.print(arr);
    }

    public static void selectionSort(int []arr){
        for(int i=0;i<arr.length;i++){
            int j=i,k=i;
            for(;j<arr.length;j++){
                if(arr[j]<arr[k])
                    k=j;
            }
            swap(arr,i,k);
        }
    }

    public static void swap(int []arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
