package array;

public class SwapAlternate {
    public static void main(String[] args) {
        int []arr = {1,2,3,4,5,6,7,8,9,10};
        Print.print(arr);
        System.out.println("-----------------------");
        for(int i=1;i<arr.length;i+=2){
            swap(arr,i-1,i);
        }
        Print.print(arr);
    }

    public static void swap(int []arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
