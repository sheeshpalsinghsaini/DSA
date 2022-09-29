package array;

public class MaxSumSubarray {

    //brute force
    public static int maxSumSubArray(int []number){
        int maxSum=Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;
        int sum =0;
        for(int i=0;i<number.length;i++){
            int start = i;
            for(int j=i;j<number.length;j++){
                int end = j;

                for(int k=start;k<=end;k++){
                    sum+=number[k];
                }
                if(maxSum<sum)
                    maxSum = sum;
                if(minSum>sum)
                    minSum = sum;
                sum = 0;
            }
        }
        return maxSum;
    }

    //Efficent solution
    public static int KadanysAlgo(int []arr){
        int max = Integer.MIN_VALUE;
        int curr = 0;

        for(int i=0;i<arr.length;i++){
            curr += arr[i];
            if(curr>max)
                max = curr;
            if(curr<0)
                curr = 0;
        }
        return max;
    }
    
    public static void main(String[] args) {
        int []number = {2,4,6,-8,10};

       System.out.println("Max sum : "+KadanysAlgo(number));

       
    }
}
