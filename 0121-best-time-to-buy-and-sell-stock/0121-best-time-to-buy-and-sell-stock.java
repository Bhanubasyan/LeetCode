class Solution {
    public int maxProfit(int[] prices) {
 
       int minPrice = Integer.MAX_VALUE;
       int maxProfit  = 0;

       for(int i = 0; i < prices.length ; i ++){
       
      //WE TRACK min value of buy 

      if(prices[i] < minPrice){
        minPrice = prices[i];
      }

      int profit = prices[i] - minPrice;
      //max profit 
      if(profit > maxProfit)
      {

       maxProfit = profit ;

      }

       } 
       return maxProfit;
    }
}