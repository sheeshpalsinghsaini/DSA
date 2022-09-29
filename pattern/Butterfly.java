package pattern;

public class Butterfly {
    public static void main(String[] args) {
        
        int row = 5;

        //first half
        for(int i=1;i<=row;i++){
            //print start
            for(int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
            //print start 2(n-i)
            for(int j=1;j<=2*(row-i);j++){
                System.out.print("  ");
            }
            //print start
            for(int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();

        }
        //second half

        for(int i=row;i>=1;i--){
            //inner is same as first half
            //print start
            for(int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
            //print start 2(n-i)
            for(int j=1;j<=2*(row-i);j++){
                System.out.print("  ");
            }
            //print start
            for(int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}

/*
 *      *      *
 *      **    **
 *      ***  ***
 *      ********
 *      ********
 *      ***  ***
 *      **    **
 *      *      *
 * 
 * 
 * 
 */
