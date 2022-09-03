package array;

public class MaxSumSubArray {
    
    public static int maxSumSubArray(int []arr){
        int res = arr[0];
        // for(int i=0;i<arr.length;i++){
        //     res += arr[i];
        //     if(res<0)
        //         res = 0;
        // }
        // return res;
        for(int i=1;i<arr.length;i++){
            int curr = 0;
            for(int j=i;j<arr.length;j++){
                curr += arr[j];
                
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        
        int []arr = {2,3,-8,7,-1,2,3};

        System.out.println(maxSumSubArray(arr));

    }
}
