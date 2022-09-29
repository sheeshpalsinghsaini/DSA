package backtracking;

public class BacktrackingDemo {
    
    public static void backtracking(int []arr,int index,int val){

        if(index == arr.length){
            printArray(arr);
            return;
        }
        //working
        arr[index] = val;
        backtracking(arr, index+1,val+1);
        arr[index] *= 2;
    }
    public static void main(String[] args) {
        
        int []arr = new int[5];
        backtracking(arr, 0, 1);
        printArray(arr);

    }

    public static void printArray(int []arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
