package sorting;

public class MergeSort {

    //merge method
    public static void merge(int []arr,int start,int mid, int end){
        int n1 = mid-start+1;
        int n2 = end-mid;

        int []L = new int[n1];
        int []R = new int[n2];

        for(int i=0;i<L.length;i++){
            L[i] = arr[start+i];
        }
        for(int i=0;i<R.length;i++){
            R[i] = arr[mid+1+i];
        }

        //now copy these sorted array into real array.

        int i=0,j=0,k=start;

        while(i<n1 && j<n2){
            if(L[i]<R[j]){
                arr[k++] = L[i++];
            }
            else{
                arr[k++] = R[j++];
            }
        }

        while(i<n1) arr[k++] = L[i++];
        while(j<n2) arr[k++] = R[j++];
    }


    //mergesort method
    public static void mergeSort(int []arr,int start,int end){
        if(start<end){
            int mid = (end-start)/2 + start;
            mergeSort(arr, start, mid);
            mergeSort(arr, mid+1, end);
            merge(arr,start,mid,end);
        }
    }
    

    public static void main(String[] args) {
        int []arr = {4,2,3,6,5,8,7,9,1};
        Print.print(arr);
        mergeSort(arr, 0, arr.length-1);
        Print.print(arr);
    }
}
