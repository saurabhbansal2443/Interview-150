class Solution {
    public int jump(int[] nums) {
        // if(nums[0] == 0 ) return 0 ; 
        if(nums.length == 1 ) return 0 ; 
        int ans =1 ; 
        int jump = nums[0] ;
        int index = 0 ;  

        while( index < nums.length  ){

            if(jump>= nums.length -1 ){
                return ans ; 
            }
            int maxJump = 0 ; 
            for(int i=index+1; i <=jump ; i++ ){
                
                maxJump= Math.max( maxJump , i+nums[i]); 
            }
            ans++; 
            index = jump ; 
            jump = maxJump ; 
        }

        return ans ; 
    }
}