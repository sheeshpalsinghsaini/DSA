package sorting;

public class BubbleSort {
    public static void main(String[] args) {
        
        int []nums = {7,3,5,4,6,8,2,9,1};
        Print.print(nums);
        System.out.println("-----------------------");
        bubbleSort(nums);
        Print.print(nums);
        System.out.println("-----------------------");
        bubbleSort2(nums);
        Print.print(nums);



    }

    //ascending order
    public static void bubbleSort(int []nums){
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]>nums[j]){
                    swap(nums,i,j);
                }
            }
        }
    }
    //descending order
    public static void bubbleSort2(int []nums){
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]<nums[j])
                    swap(nums, i, j);
            }
        }
    }
    public static void swap(int []nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
