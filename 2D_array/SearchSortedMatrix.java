public class SearchSortedMatrix {
   

    public static boolean stairCaseSearch(int [][]matrix,int key){
        int row = 0;
        int col = matrix[0].length-1;

        while(row<=matrix.length-1 && col>=0){
            if(key == matrix[row][col]){
                System.out.println("Key found at ("+row+","+col+" )");
                return true;
            }else if(key<matrix[row][col])
                    col--;
            else 
                row++;
        }
        System.out.println("Key Not found ");
        return false;
    }
    public static void main(String[] args) {

        int [][]matrix = {
                            {10,20,30,40},
                            {15,25,35,45},
                            {27,29,37,48},
                            {32,33,39,50}
                         };

        
        print(matrix);
        System.out.println("---------------------------");
        stairCaseSearch(matrix,27);

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
