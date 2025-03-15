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
}