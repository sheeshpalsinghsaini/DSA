package matrix;

public class TransposeMatrix {
    
    public static void main(String[] args) {
        
        int [][]matrix = new int[][]{
            // {1,2,3,4},
            // {2,3,4,5},
            // {3,4,5,6},
            // {4,5,6,7}
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        print(matrix);
        System.out.println("--------------");
        // tranposeMatrix(matrix);
        // print(matrix);
        tranposeMatrix(matrix);
        print(matrix);

    }

 
    public static void tranposeMatrix(int [][]matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=i+1;j<matrix[i].length;j++){
                // swap(matrix,i,j);
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
    // public static void tranposeMatrix(int [][]matrix){
    //     for(int i=0;i<matrix.length;i++){
    //         for(int j=i+1;j<matrix[i].length;j++){
    //             // swap(matrix,i,j);
    //             // matrix[i][j] = matrix[j][i];
    //             // System.out.print(matrix[i][j]+" ");
    //             // System.out.print(matrix[j][i]+" ");
    //         }
            
           
    //     }
       
    // }

    // public static void transposeMatrix(int [][]matrix){
    //     for(int i=0;i<matrix.length;i++){
    //         for(int j=0;j<matrix[i].length;j++){
    //             int temp = matrix[i][j];
    //             matrix[i][j] = matrix[j][i];
    //             matrix[j][i] = temp;
    //         }
    //     }
    // }


    // public static void swap(int [][]matrix,int i,int j){
    //     int temp = matrix[i][j];
    //     matrix[i][j] = matrix[j][i];
    //     matrix[j][i] = temp;
    // }


    public static void print(int [][]matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
