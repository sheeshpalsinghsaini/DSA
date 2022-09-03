package matrix;

public class PrintPrincipleDiagnole {
    
    public static void main(String[] args) {
        
        int [][]matrix = new int[][]{
            {2,3,4},
            {6,7,8},
            {5,6,7}
        };

        print(matrix);
        System.out.println("----------------");
        printPrincipleDiagonle(matrix);
        System.out.println("----------------");
        printRightDiagnole(matrix);
        

    }
    public static void printRightDiagnole(int [][]matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(i+j==matrix.length-1){
                    System.out.println(matrix[i][j]);
                }
            }
        }
    }

    public static void printPrincipleDiagonle(int [][]matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(i==j){
                    System.out.println(matrix[i][j]);
                }
            }
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
