package array;

public class TrappingRainWater {
    
    //naive solution....
    public static int trappWater(int []arr){
        //array value consider as bar,we cannt collect any water at cornner bar.
        //so we will start collecting water between corner bar.
        int res = 0;
        for(int i=1;i<arr.length-1;i++){
            int lmax = arr[i];
            for(int j=0;j<i;j++){
                if(arr[j]>lmax)
                    lmax = arr[j];
            }
            int rmax = arr[i];
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]>rmax)
                    rmax = arr[j];
            }
            res += ((lmax<rmax)?lmax:rmax) - arr[i];// min(lmax,rmax) - arr[i];
        }
        return res;

    }

    //efficeint solution....
    public static int trappWater2(int []arr){
        int res = 0;

        int n = arr.length;
        int []lmax = new int[n];
        int []rmax = new int[n];
        lmax[0] = arr[0];

        for(int i=1;i<n;i++){
            lmax[i] = Math.max(arr[i], lmax[i-1]);
        }

        rmax[n-1] = arr[n-1];
        for(int i=n-2;i>=0;i--){
            rmax[i] = Math.max(arr[i], rmax[i+1]);
        }

        for(int i=1;i<n-1;i++){
            res += Math.min(lmax[i], rmax[i])-arr[i];
        }

        return res;
    }

    public static void main(String[] args) {
        
        // int []arr = {3,0,1,2,5};    //in asc & dsc order we can not store any unit of water.
        // int []arr = {1,2,3};
        int []arr = {3,5,2,3};
        System.out.println(trappWater(arr));


    }
}
