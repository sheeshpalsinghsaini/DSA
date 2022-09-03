package array;

public class LeaderInArray {
    //navie solution
    public static void leaderElements(int []nums){
        for(int i=0;i<nums.length;i++){
            boolean flag = true;
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]>nums[i])
                    flag = false;
            }
            if(flag==true)
                System.out.print(nums[i]+" ");
        }
    }
    //efficient solution
    
    public static void leaderElements2(int []arr){
        int n = arr.length-1;
        int leader = arr[n];
        System.out.print(leader+" ");

        for(int i=n-1;i>=0;i--){
            if(arr[i]>leader){
                leader = arr[i];
                System.out.print(leader+" ");
            }
        }
    }
    
    public static void main(String[] args) {
        int []arr = {7,10,4,3,6,5,2};
        leaderElements2(arr);
        
    }
}
