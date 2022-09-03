package array;

public class MaxDiffProblem {
    
    //navie solution
    public static int maxDiff(int []arr){
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                sum = arr[j] - arr[i];
                if(sum>max)
                    max = sum;
            }
        }
        return max;
    }
    //efficient solution
    public static int maxDiff2(int []arr){
        int res = Integer.MIN_VALUE;
        int minValue = arr[0];
        
        for(int j=1;j<arr.length;j++){
            res = Math.max(res, arr[j]-minValue);
            minValue = Math.min(minValue, arr[j]);
        }
        return res;
    }
    public static void main(String[] args) {
        int []arr = {2,3,10,6,4,8};
        // int []arr = {10,20,30};
        // int []arr = {30,10,8,2};
        System.out.println(maxDiff2(arr));
    }
}
/*
 * max value of arr[j]-arr[i]
 *  such that j>i
 * 
 */