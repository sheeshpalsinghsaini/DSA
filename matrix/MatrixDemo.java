package matrix;

public class MatrixDemo {
    
    public static void main(String[] args) {
        
        System.out.println("Good Morning, Sheeshpal Singh Saini");
        int [][]matrix = new int[][]{{1,2,3},{4,5,6},{7,8,9}};

        print(matrix);
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
