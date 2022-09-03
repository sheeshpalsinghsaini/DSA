package matrix;

public class SnackPrint {
    
    public static void main(String[] args) {
        
        int [][]matrix = new int[][]{
            {5,6,4},
            {2,4,3},
            {7,6,8}
        };

        print(matrix);
        System.out.println("-------------");
        printSnackForm(matrix);

    }

    public static void printSnackForm(int [][]matrix){
        boolean flag = true;
        for(int i=0;i<matrix.length;i++){
            if(flag){
                for(int j=0;j<matrix[i].length;j++){
                    System.out.print(matrix[i][j]+" ");
                }
                flag=false;
            }else{
                for(int j=matrix[i].length-1;j>=0;j--){
                    System.out.print(matrix[i][j]+" ");
                }
                flag=true;
            }
            System.out.println();
        }
    }

    public static void print(int [][]matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
