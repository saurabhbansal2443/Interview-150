class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0 ; 

        for(int i=1 ; i<prices.length ; i++ ){
            int currentProfit = prices[i]-prices[i-1] ; 
            profit = Math.max(profit+currentProfit , profit); 
        }

        return profit ; 
    }
}
// in this question in order to solve this make a graph of prices then you will see there 
// that there is some slopes which is going up and some slopes which are going down 
// from this slopes we have got a understanding that when slopes are going upwards 
// that means stock price is increasing and we have to calculate the profit and if 
// buy the stock on that day and sell on the next day it is goin to give us profit 
// so here in this question as we have to calculate the maximum profit of the series of the 
// day so will take the profit and will ignore the losses so 
// in this question we have used the trick that if adjacent value that means 
// prices[i] - prices[i-1] is giving positive value (that means profit ) only adding that 
// transcition to that profit and returning the maximum profit 