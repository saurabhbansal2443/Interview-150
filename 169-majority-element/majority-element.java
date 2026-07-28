class Solution {
    public int majorityElement(int[] nums) {
        
        int me = nums[0]; 
        int fre = 1 ; 

        for(int i=1 ; i<nums.length ; i++ ){

            if(fre == 0 ){
                me = nums[i]; 
               
            }
             if(nums[i] == me ){
                fre++; 
            }else{
                fre--; 
            }
        }
        return me ; 
    }
}