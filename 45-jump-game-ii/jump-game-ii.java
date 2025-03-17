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

// in this question we have 2 find the minimum number of jumps to cross the 
//array or reach the last index for that we have selected a window from index
// 1 --> nums[0] first then find out the maximum number of index which can be
// reached from this array and then the next window is nums[0]-->nums[maxJump]
//kind of this thing 

// if we just see the code it seem to be O(n^2) but the time complexity is just o(n) 
// as we are traversing the array only one time 