package array;

public class ReverseArray {
    public static void main(String[] args) {
        int []nums = {1,2,3,4,5,6,7,8,9};
        Print.print(nums);

        System.out.println("-----------------------");
        reverseArray(nums);
        Print.print(nums);
    }
    public static void reverseArray(int []array){
        int i=0;
        int j=array.length-1;

        while(i<j){
            swap(array,i,j);
            i++;
            j--;
        }
    }

    public static void swap(int []arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
