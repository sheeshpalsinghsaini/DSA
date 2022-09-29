package DivideConquer;

public class MergeSortProblem {
    
    public static void mergeSort(int []arr,int start,int end){
        if(start>=end)
            return;
        int mid = start + (end-start)/2;
        mergeSort(arr, start, mid);
        mergeSort(arr, mid+1, end);
        merge(arr,start,mid,end);
    }

    public static void merge(int []arr,int start,int mid,int end){
        int []tmp = new int[end-start+1];
        int i = start;
        int j = mid+1;
        int k = 0;

        while(i<=mid && j<=end){
            if(arr[i]<arr[j])
                tmp[k++] = arr[i++];
            else 
                tmp[k++] = arr[j++];
        }

        //if elements left in left part
        while(i<=mid)  tmp[k++] = arr[i++];
        //if elements left in right part
        while(j<=end) tmp[k++] = arr[j++];

        //copy whole tmp into acutual array
        for(i=0,k=start;i<tmp.length;i++,k++){
            arr[k] = tmp[i];
        }

    }
    
    public static void main(String[] args) {
        
        int []arr = {6,5,4,7,8,3,9,1,2};
        print(arr);
        mergeSort(arr, 0, arr.length-1);
        print(arr);
    }

    public static void print(int []arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
