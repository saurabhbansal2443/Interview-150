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

// int this question we have used the trick that if adjacent value that means 
// prices[i] - prices[i-1] is giving positive value only adding that 
// transcition to that profit 