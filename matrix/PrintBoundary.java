package matrix;

public class PrintBoundary {
    
    public static void main(String[] args) {
        
        int [][]matrix = new int[][]{
            {1,2,3},
            {4,5,6},
            {7,8,9},
            {6,4,8}
        };

        System.out.println("Row : "+matrix.length);
        System.out.println("Column :"+matrix[0].length);
        System.out.println("---------------");
        print(matrix);
        System.out.println("---------------");
        printBoundary(matrix);
        System.out.println("---------------");

    }



    //method to print boundry of matrix 
    public static void printBoundary(int [][]matrix){
        int row = matrix.length;
        int Column = matrix[0].length;
        if(row==1){
            for(int i=0;i<Column;i++){
                System.out.print(matrix[0][i]+" ");
            }
        }else if(Column==1){
            for(int i=0;i<row;i++){
                System.out.print(matrix[i][0]+" ");
            }
        }else{

            for(int i=0;i<Column;i++){
                System.out.print(matrix[0][i]+" ");
            }
            for(int i=1;i<row;i++){
                System.out.print(matrix[i][Column-1]+" ");
            }
            for(int i=Column-2;i>=0;i--){
                System.out.print(matrix[row-1][i]+" ");
            }
            for(int i=row-2;i>=1;i--){
                System.out.print(matrix[i][0]+" ");
            }

        }
        System.out.println();
    }



    //method to print matrix
    public static void print(int [][]matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
