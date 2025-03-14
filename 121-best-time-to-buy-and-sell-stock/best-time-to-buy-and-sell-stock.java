class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int[] max = new int[n];

        max[n - 1] = prices[n - 1];

        for (int i = n - 2; i >= 0; i--) {

            max[i] = Math.max(max[i + 1], prices[i + 1]);
        }

        int profit = 0;

        for (int i = 0; i < n; i++) {
            profit = Math.max(profit, max[i] - prices[i]);
        }
        return profit;
    }

    // we have taken a approach where first we have find the max array which is 
    // just a array containing the max value after that value and then subracting the value 
    //from there and  then runned loop over the main array and get the maximum profit 
}