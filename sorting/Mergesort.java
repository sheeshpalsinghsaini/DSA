package sorting;

public class Mergesort {
    
    public static void main(String[] args) {
        
        int []arr = {6,4,5,8,7,9,1,3,2};

        mergeSort(arr, 0, arr.length-1);
        Print.print(arr);

    }
    public static void mergeSort(int []arr,int start,int end){  //Tn = O(nlongn), Sn = O(n)
        if(start<end){
            int mid = (end-start)/2 + start;
            mergeSort(arr, start, mid);
            mergeSort(arr, mid+1, end);
            merge(arr,start,mid,end);
        }
    }

    //merge two sorted array.
    public static void merge(int []arr,int start,int mid,int end){
        int n1 = mid-start+1;
        int n2 = end-mid;
        int []L = new int[n1];
        int []R = new int[n2];

        for(int i=0;i<L.length;i++){
            L[i] = arr[i+start];
        }
        for(int j=0;j<R.length;j++){
            R[j] = arr[j+mid+1];
        }

        int i=0,j=0,k=start;
        while(i<n1 && j<n2){
            if(L[i]<=R[j])
                arr[k++] = L[i++];
            else 
                arr[k++] = R[j++];
        }

        while(i<n1) arr[k++] = L[i++];
        while(j<n2) arr[k++] = R[j++];

    }

}
