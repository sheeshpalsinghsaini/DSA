package matrix;

public class SumOfRow {

    public static void main(String[] args) {
        
        int [][]mat = new int[][]{
            {2,3,4},
            {6,7,8},
            {9,4,7}
        };

        print(mat);
        System.out.println("-----------------------");
        sumRow(mat);

    }

    public static void sumRow(int [][]mat){
        for(int i=0;i<mat.length;i++){
            int sum = 0;
            for(int j=0;j<mat[i].length;j++){
                sum+=mat[i][j];
            }
            System.out.println(sum);
        }
        System.out.println();
    }


    public static void print(int [][]mat){
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
