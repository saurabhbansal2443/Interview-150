class Solution {
    public int jump(int[] nums) {
        
        if(nums.length == 1 ) return 0 ; 
        int jump = 1 ; 
        int jumpIndex = nums[0];
        int maxJump = 0 ; 

        int index = 0 ; 

        while(index <= nums.length-1 && jumpIndex <nums.length-1 ){

            for(int i = index ; i<= jumpIndex && i <nums.length ; i++ ){
                maxJump = Math.max(maxJump , (nums[i] + i )); 
            }
            index = jumpIndex; 
            jump++ ; 
            jumpIndex  = maxJump ; 

        }

        return jump ; 



        
    }
}