package recursion;

public class TillingProblem {   //we have 2*n board/floar, till -> 2*1
    
    public static int tillingProblem(int n){
        if(n==0 || n==1)
            return 1;

        //vertical choice
            int verticalChoice = tillingProblem(n-1);
        //horizontal choice
            int horizontalChoice = tillingProblem(n-2);

        //total choice 
            int totalChoice = verticalChoice + horizontalChoice;
            return totalChoice;

    }

    public static void main(String[] args) {
        
        System.out.println(tillingProblem(3));
    }
}
