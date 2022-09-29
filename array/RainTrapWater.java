package array;

public class RainTrapWater {
    public static void print(int []arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int []height = {4,2,0,6,3,2,5};

        //create two aux array 1. left max, 2. right max
        int []leftMax = new int[height.length];
        int []rightMax = new int[height.length];
        leftMax[0] = height[0];
        for(int i=1;i<height.length;i++){
            leftMax[i] = Math.max(leftMax[i-1], height[i]);
        }
        rightMax[height.length-1] = height[height.length-1];

        for(int i=height.length-2;i>=0;i--){
            rightMax[i] = Math.max(rightMax[i+1], height[i]);
        }

        print(leftMax);
        print(rightMax);
        print(height);

        int res = 0;
        //now calculate rain traping water.
        for(int i=1;i<height.length-1;i++){
            int min = Math.min(leftMax[i], rightMax[i]);
            int curr = min - height[i];
            if(curr<0){
                curr = 0;
            }
            res  += curr;
        }
        System.out.println(res);
    }
}
