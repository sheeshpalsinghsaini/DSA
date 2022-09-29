package methods;

public class DecToBin {

    public static void decTobin(int n){
        int decNumber = n;
        int binNumber = 0;
        int pow = 0;
        while(n>0){
            int rem = n%2;
            binNumber = binNumber + rem*(int)Math.pow(10, pow);
            pow++;
            n = n/2;
        }
        System.out.println("Binar of "+decNumber+" decimal number is "+binNumber);
    }
   public static void main(String[] args) {
    decTobin(15);
   } 
}
