package array;

public class LeftRotate {
    //left rotate array one one.
    public static void rotateByOne(int []arr){
        int num = arr[0];
        for(int i=1;i<arr.length;i++){
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = num;
    }

    //left rotate by D places.
    //naive is run loop for d time and rotate in each iteration by one.
    //efficient solution

    public static void rotateDPlaces(int []nums,int d){
        //reverse d digit, reverse remaining n-d digit and rever whole array.
        reverseArray(nums, 0, d-1);
        reverseArray(nums,d,nums.length-1);
        reverseArray(nums, 0, nums.length-1);
    }
    public static void reverseArray(int []arr,int start,int end){
        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }

    public static void swap(int []arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    public static void main(String[] args) {
        int []nums = {1,2,3,4,5,6,7,8,9};
        print(nums);
        // rotateByOne(nums);
        rotateDPlaces(nums, 3);
        print(nums);


    }
    public static void print(int []nums){
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println();
    }
}
