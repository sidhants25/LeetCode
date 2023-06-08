public class BuySellStocks_121 {

    //121. Best Time to Buy and Sell Stock
    // O(n) Solution
    public int maxProfit(int[] prices) {

        int cheapestBuy = Integer.MAX_VALUE;
        int currProfit = 0;

        for (int i = 0 ; i < prices.length; i++){
            if (prices[i] < cheapestBuy) {
                cheapestBuy = prices[i];
            }
            if (prices[i] - cheapestBuy > currProfit) {
                currProfit = prices[i] - cheapestBuy;
            }
        }

        return currProfit;

    }
}