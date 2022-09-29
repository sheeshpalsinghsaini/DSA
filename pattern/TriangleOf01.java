package pattern;

public class TriangleOf01 {
    public static void main(String[] args) {
        int row = 6;

        for(int i=1; i<=row;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print(1+" ");
                }if((i+j)%2!=0){
                    System.out.print(0+" ");
                }
            }
            System.out.println();
        }
    }
}
/*
 *      1
 *      0 1
 *      1 0 1
 *      0 1 0 1
 *      1 0 1 0 1 
 * 
 */
