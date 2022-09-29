package recursion;

public class PrintDecreasingOrder {

    public static void printDesc(int n){
        if(n<1)
            return;
        System.out.print(n+" ");
        printDesc(n-1);
    }

    public static void main(String[] args) {
        
        printDesc(12);
        System.out.println();
    }
    
}
