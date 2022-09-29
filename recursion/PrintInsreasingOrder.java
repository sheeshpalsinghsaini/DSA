package recursion;

public class PrintInsreasingOrder {
    
    public static void printInsc(int n){
        if(n<1)
            return;

        printInsc(n-1);
        System.out.print(n+" ");
    }

    public static void main(String[] args) {
        printInsc(12);
    }
}
