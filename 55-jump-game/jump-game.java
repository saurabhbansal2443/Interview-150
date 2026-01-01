class Solution {
    public boolean canJump(int[] nums) {

        int length = nums.length;

        int maxAllowedIndex = nums[0];

        if (maxAllowedIndex == length - 1) {
            return true;
        }
        if(nums[0] == 0 ){
            return false ; 
        }else if (nums.length == 1){
            return true ; 
        }

        int idx = 1;

        while(idx <= maxAllowedIndex && idx < length) {
           maxAllowedIndex = Math.max(maxAllowedIndex,nums[idx] + idx); 

           if(nums[idx] + idx >= length-1){
            return true ; 
           } 
           idx++;
        }
        return false ; 
    }
}