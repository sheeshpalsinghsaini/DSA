package recursion;

public class RopeCutting {
    
    public static int ropecuttingMax(int n,int a,int b,int c){
        if(n==0)
            return 0;
        if(n<0) 
            return -1;
        int aMax = ropecuttingMax(n-a, a, b, c);
        int bMax = ropecuttingMax(n-b, a, b, c);
        int cMax = ropecuttingMax(n-c, a, b, c);
        int res = Math.max(aMax, Math.max(bMax, cMax));
        if(res==-1)
            return -1;
        return res+1;
            
    }

    public static void main(String[] args) {
        int n=23;
        int a=12;
        int b=9;
        int c=11;

        System.out.println(ropecuttingMax(n, a, b, c));


    }
}
