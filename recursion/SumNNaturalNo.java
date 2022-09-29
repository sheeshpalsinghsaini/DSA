package recursion;

public class SumNNaturalNo {
    
    public static int sumNNaturalNo(int n){
        if(n==1)
            return n;
        // System.out.print(n+" ");
        return n+sumNNaturalNo(n-1);
        
    }
    public static void main(String[] args) {
        System.out.println(sumNNaturalNo(4));
    }
}
