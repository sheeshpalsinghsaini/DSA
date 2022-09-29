public class PrintDiagonal {

    public static void main(String[] args) {
        int [][]matrix = {{1,2,3},
                          {3,4,5},
                          {5,6,7}};

        print(matrix);
        System.out.println("Primary Diagonal ");
        for(int i=0;i<matrix.length;i++){
            System.out.print(matrix[i][i]+" ");
        }
        System.out.println();

        
        System.out.println("Secondary Diagonal");
        for(int i=0;i<matrix.length;i++){
            System.out.print(matrix[i][matrix.length-1-i]+" ");
        }
        System.out.println();


    }

    public static void print(int [][]matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
