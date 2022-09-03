package recursion;

public class CountSubsetGivenSum {
    
    public static int countSubsetSum(int []array,int len,int sum){
        if(len==0){
            return (sum==0)?1:0;
        }
        return countSubsetSum(array, len-1, sum)+countSubsetSum(array, len-1, sum-array[len-1]);
    }
    public static void main(String[] args) {
        int []arr = {10,5,2,3,6};
        int sum = 8;
        System.out.println(countSubsetSum(arr,arr.length, sum));

    }
}
