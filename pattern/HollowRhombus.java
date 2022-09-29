package pattern;

public class HollowRhombus {
    
    public static void main(String[] args) {
        int n=10;

        for(int i=1;i<=n;i++){
            //space
            for(int j=1;j<2*(n-i);j++){
                System.out.print(" ");
            }

            //start + space, star = i=1||j==1||i=n||j==n,rest of space
            for(int j=1;j<=n;j++){
                if(i==1 || j==1 || i==n || j==n){
                    System.out.print("*"+" ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
