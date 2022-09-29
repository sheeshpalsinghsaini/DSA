package recursion;

public class Power {
   

    //brute force
    public static int power(int x,int n){
        if(n==1)
            return x;
        return x*power(x, n-1);
    }

    //optimise solution
    public static int power2(int x,int n){
        if(n==1)
            return x;
        // if(n%2==0)   //still O(n)
        //     return power2(x, n/2)*power2(x, n/2);
        //  return x*power2(x, n/2)*power2(x, n/2);

        int halfPower = power2(x, n/2);
        if(n%2==0)
            return halfPower*halfPower;
        return x*halfPower*halfPower;
    }
    public static void main(String[] args) {
        System.out.println(power2(2, 10));

    }
}
