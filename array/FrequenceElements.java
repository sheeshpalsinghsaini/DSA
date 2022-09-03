package array;

import java.util.HashMap;

public class FrequenceElements {
    
    // public static void printFrequency(int []arr){
    //     int freq = 1;
    //     int i=1;
    //     int n = arr.length;

    //     while(i<n){
    //         while(i<n && arr[i]==arr[i-1]){
    //             i++;
    //             freq++;
    //         }
    //         System.out.println(arr[i-1]+" : "+freq);
    //         i++;
    //         freq=1;
    //     }
    //     if(n==1 || arr[n-1]!=arr[n-2])
    //         System.out.println(arr[n-1]+" : "+1);
    // }

    

    //efficient way
    public static void printFrequency(int []arr){
        int count = 1;
        int n = arr.length;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1])
                count++;
            else{
                System.out.println(arr[i]+" : "+count);
                count = 1;
            }
        }

        if(n==1 || arr[n-1]!=arr[n-2])
            System.out.println(arr[n-1]+" : "+1);
        else
            System.out.println(arr[n-1]+" : "+count);
            
        
    }

    //naive solution : using hashmap
    public static void printFrequencey2(int []arr){
        HashMap<Integer,Integer> freq = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            if(!freq.containsKey(arr[i]))
                freq.put(arr[i], 1);
            else
                freq.put(arr[i], freq.get(arr[i])+1);
        }

        freq.forEach((key,value)->{
            System.out.println(key +" : "+value);
        });
    }
    public static void main(String[] args) {
        // int []arr = {10,10,10,25,30,30};
        int []arr = {10,10,10,25,30,30,40};
        printFrequencey2(arr);
    }
}
