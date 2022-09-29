package methods;

public class BinToDec{

    public static void binToDec(int n){
        int binNum = n;
        int dec = 0;
        int pow = 0;
        while(n>0){
            int lastDigi = n%10;
            dec = dec + lastDigi*(int)Math.pow(2, pow);
            pow++;
            n = n/10;
        }
        System.out.println("Decimal of "+binNum+" binary number is = "+dec);
    }
    public static void main(String[] args) {
        binToDec(101101);
    }
}