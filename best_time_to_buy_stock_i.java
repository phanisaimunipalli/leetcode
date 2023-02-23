class Solution {
    public int maxProfit(int[] prices) {
        // we need to track a minprice to consider everyday's stock price (buyprice TO BEGIN)
        int prevdayPrice = Integer.MAX_VALUE;
        int maxprofit = 0;  // currentdayPrice - prevdayPrice ==> prices[i] - minprice
        // iterate until all the days 
        for (int i = 0; i < prices.length; i++) {
            // if current day price is less than prevdayPrice (until today) ==> then we will store todayprice
            if (prices[i] < prevdayPrice){
                // then we will store todayprice so that we can get even lesser price
                prevdayPrice = prices[i];   
            }else if(prices[i] - prevdayPrice > maxprofit){
                // if current day price is greater than prevDayPrice ==> update maxProfit
                maxprofit = prices[i] - prevdayPrice;
            }
            
        }
        return maxprofit;   //  finally return the maxProfit you had
    }
}
