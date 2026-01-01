class Solution {
    public int maxProfit(int[] prices) {
       int[] max = new int[prices.length]; 

       max[prices.length-1] = 0 ; 

       for(int i=prices.length-2; i>=0 ; i--){
            max[i] = Math.max(max[i+1],prices[i+1]); 
       } 

       int profit = 0 ; 

       for(int i=0 ; i<prices.length ; i++){
         int currProfit = max[i] - prices[i]; 

         if(currProfit>profit){
            profit = currProfit; 
         }
       } 
       return profit>0?profit : 0 ; 
    }
}