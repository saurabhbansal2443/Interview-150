class Solution {
    public int removeDuplicates(int[] nums) {
        int start = 2 ; 
        int end = 2 ; 

        while(end < nums.length ){

            if(nums[start -2 ] == nums[end]){
                end++ ; 
            }else{
                nums[start] = nums[end]; 
                start++; 
                end++ ; 
            }
        }

        return start ; 
    }
}