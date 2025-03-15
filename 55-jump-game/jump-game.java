class Solution {
    public boolean canJump(int[] nums) {
        int jump = nums[0]; 

        for(int i=1 ; i<nums.length ; i++ ){
            if( i >  jump ){
                return false ; 
            }else if ( jump >= nums.length-1){
                return true ; 
            }
            jump = Math.max(i+nums[i] , jump ); 
        }

        return true ; 
    }

    // in this question we have used a logic we are calculating the highest 
    // number of index we can reach so we are adding the index and value if 
    // at any index we can reach the maximum value that means last index 
    // we will return true and if there is any index which is not possible 
    // returining false from there and jump is storing the maximum number of 
    // index can be reached 
}