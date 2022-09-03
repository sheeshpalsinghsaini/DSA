package array;

public class MaxConsecutive1 {
    //naive solution
    public static int maxConsecutive1(int []arr){
        int res = 0;
        int n = arr.length;
        int count = 0;
        for(int i=0;i<n;i++){
            if(arr[i]==1){
                count++;
                res = Math.max(count,res);
            }else{
                count = 0;
            }
                
        }
        return res;
    }
    public static void main(String[] args) {
        int []arr = {0,1,1,1,0,1,1};

        System.out.println(maxConsecutive1(arr));
        
    }


}
