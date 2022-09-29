package pattern;

public class InvertedRotatedHalfPyramid {
    public static void main(String[] args) {
        int row = 8;
        // int col = 8;

        for(int i=1;i<=row;i++){
            //for space 
            for(int j=(row-i);j>0;j--){
                System.out.print("  ");
            }
            //for * 
            for(int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
/*
 *         *
 *        **
 *       ***
 *      ****
 *     *****
 *    ******
 *  
 */
