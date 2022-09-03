package array;

public class MoveZeroEnd {
    //using extra space 
    public static int moveZeroEnd(int []array){
        int []temp = new int[array.length];
        int res = 0;
        for(int i=0;i<array.length;i++){
            if(array[i]!=0){
                temp[res++]=array[i];
            }
        }
        for(int i=0;i<temp.length;i++){    //initially temp ele zero,
            array[i] = temp[i];
        }
        return res;
    }
    
    public static void swap(int []arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    //nive without extra space.
    public static void moveZeroEnd2(int []arr){ //Tn = O(n^2)
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                for(int j=i+1;j<arr.length;j++){
                    if(arr[j]!=0)
                        swap(arr,i,j);
                }
            }
        }
    }


    //efficient solution
    public static void moveZeroEnd3(int []arr){
        int res = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0)
                swap(arr, res++, i);
        }
    }
    
    public static void main(String[] args) {
        
        int []arr = {8,0,0,5,0,10,0,20};
        moveZeroEnd3(arr);
        print(arr, arr.length);

    }

    public static void print(int []arr,int size){
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
