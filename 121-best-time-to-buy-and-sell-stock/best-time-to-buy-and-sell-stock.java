class Solution {
    public int maxProfit(int[] prices) {
        int miniPriceBuy = Integer.MAX_VALUE;
        int maxProfit = 0;
        
        for (int i =0; i < prices.length; i++) {
            if (prices [i] < miniPriceBuy) 
                miniPriceBuy = prices [i];
             else if (prices [i] - miniPriceBuy > maxProfit) 
                maxProfit = prices [i] - miniPriceBuy;
        }
        
        return maxProfit;
    }
}