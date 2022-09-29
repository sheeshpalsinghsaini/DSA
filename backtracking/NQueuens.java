package backtracking;

public class NQueuens {

    public static void nQueuens(char [][]board,int row){
        //base case 
        if(row==board.length){
            printBoard(board);
            return;
        }

        //working : column loop
        for(int j=0;j<board.length;j++){
            board[row][j] = 'Q';
            nQueuens(board, row+1);     //recursive call
            board[row][j] = '.';        //bactracking step
        }


    }
    
    public static void main(String[] args) {
        int n = 2;
        char [][]board = new char[n][n];


        //board initialization with '.'
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                board[i][j] = '.';
            }
        }
        printBoard(board);
        nQueuens(board,0);
    }


    public static void printBoard(char [][]board){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("-----------");
    }
}
