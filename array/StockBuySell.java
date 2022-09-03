package array;

public class StockBuySell {
    //single stock buy and sell
    public static int maxProfit(int []prices){
        //buy at low and sell at high
        int maxProfit = 0;
        int minValue = prices[0];

        for(int i= 1;i<prices.length;i++){
            maxProfit = Math.max(maxProfit, prices[i]-minValue);
            minValue = Math.min(minValue, prices[i]);
        }
        return maxProfit;
    }
    
    //buy and sell any no of day.
    public static int maxProfit2(int []prices){
        int maxProfit = 0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]>prices[i-1]){
                maxProfit += prices[i] - prices[i-1];
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int []stocks = {1,5,3,8,12};
        System.out.println("Single time Profit : "+maxProfit(stocks));
        System.out.println("All time profit : "+maxProfit2(stocks));

        
    }

    
}
