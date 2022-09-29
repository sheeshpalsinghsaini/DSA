

public class DiagonalSum {
    public static int diagonalSum(int [][]matrix){
        int sum = 0;

        //O(n^2) time
        // for(int i=0;i<matrix.length;i++){
        //     for(int j=0;j<matrix[0].length;j++){
        //         if(i==j){
        //             sum += matrix[i][j];
        //         }else if(i+j==matrix.length-1){     // for secondary diagonal i+j=n-1
        //             sum += matrix[i][j];
        //         }
        //     }
        // }

        //O(n) time
        for(int i=0;i<matrix.length;i++){       
            //primary diagonal sum 
            sum+=matrix[i][i];
            //secondary diagonal sum
            if(i!=matrix.length-1-i)
                sum+= matrix[i][matrix.length-i-1]; //i+j=n-1 => j = n-1-i
        }
        return sum;

    }

    public static void main(String[] args) {
        int [][]matrix = {{10,20,30,40},
                          {15,25,35,45},
                          {27,29,37,48},
                          {32,33,39,50}};

        System.out.println(diagonalSum(matrix));
    }
}
