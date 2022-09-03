package array;

public class SecondLargest {

    public static int secondLargest(int []arr){
        int res = -1;
        int largest = 0;

        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[largest]){    //two cases is here.
                res = largest;
                largest = i;

            }else if(arr[i]!=arr[largest]){
                //not same as largest
                // if(res == -1 || arr[i]>arr[res])
                //     res = i;
                if(res==-1)
                    res = i;
                else if(arr[i]>arr[res]) 
                    res = i;

            }
        }
        return res;
    }
    public static void main(String[] args) {
        int []arr = {6,3,5,4,7,9,2};

        //naive solution : find largest and make a loop again and find largest with ignore largest.
        System.out.println("Second largest : "+arr[secondLargest(arr)]);

    }
}
