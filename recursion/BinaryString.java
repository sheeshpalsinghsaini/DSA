package recursion;

public class BinaryString {

    public static void printBinaryString(int n,int lastBit,String str){
        //base condition
        if(n==0){
            System.out.println(str);
            return;
        }

        // processing
        // if(lastBit == 0){
        //     printBinaryString(n-1, 0, str+'0');
        //     printBinaryString(n-1, 1, str+'1');
        // }else{
        //     printBinaryString(n-1, 0, str+0);
        // }

        //modify code 
        printBinaryString(n-1, 0, str+'0');
        if(lastBit==0){
            printBinaryString(n-1, 1, str+'1');
        }
    }
    
    public static void main(String[] args) {
        
        printBinaryString(3, 0, "");

    }
}

/*
 *  Print all binary string of size n without consecutive ones.
 * example :
 * n = 2 
 *  op: 00, 01, 10
 * 
 */