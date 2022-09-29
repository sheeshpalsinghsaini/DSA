public class PrintSpiral {
    public static void main(String[] args) {
        
        // int [][]matrix = {
        //                   {10,20,30,40},
        //                   {15,25,35,45},
        //                   {27,29,37,48},
        //                   {32,33,39,50}
        //                  };

        int [][]matrix = {{1,2,3,4,5}};
        // int [][]matrix = {
        //                     {1},
        //                     {2},
        //                     {3},
        //                     {4},
        //                     {5},
        //                  };
        print(matrix);

        System.out.println("------------------------------");

        System.out.println("Spiral Matrix  :" );

        int startRow = 0;
        int endRow = matrix.length-1;
        int startCol = 0;
        int endCol = matrix[0].length-1;

        while(startRow<=endRow && startCol<=endCol){
            //print top 
            for(int j = startCol; j<=endCol; j++){
                System.out.print(matrix[startRow][j]+" ");
            }


            //print right

            for(int i=startRow+1;i<=endRow;i++){
                System.out.print(matrix[i][endCol]+" ");
            }

            //print bottom
            for(int j=endCol-1;j>=startCol;j--){
                if(startRow==endRow)
                    break;
                System.out.print(matrix[endRow][j]+" ");
            }

            //print left
            for(int i=endRow-1;i>=startRow+1;i--){
                if(startCol==endCol)
                    break;
                System.out.print(matrix[i][startCol]+" ");
            }

            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }


    }


    public static void print(int [][]matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
                // System.out.print("("+i+","+j+")"+" ");
            }
            System.out.println();
        }
    }
}
