package sorting;

public class InsertionSort {

    public static void main(String[] args) {
        
        int []nums = {8,4,6,5,7,3,9,2,1};
        Print.print(nums);
        System.out.println("--------------------");
        insertionSort(nums);
        Print.print(nums);
        

    }

    public static void insertionSort(int []nums){
        
        for(int i=1;i<nums.length;i++){
            int key = nums[i];
            int j = i-1;

            while(j>-1 && nums[j]>key){
                nums[j+1] = nums[j];
                j--;
            }
            nums[++j] = key;
        }
    }
    
}
