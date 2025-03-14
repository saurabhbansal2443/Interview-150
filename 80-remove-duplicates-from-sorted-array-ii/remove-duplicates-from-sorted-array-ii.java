class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length ==1 || nums.length ==2 ) return nums.length ; 
         
         int p1 =2 ; 
         int p2 = 2 ; 

         while( p2< nums.length ){

            if(nums[p1-2]!=nums[p2]){
                nums[p1] = nums[p2];
                p1++ ; 
            }
            p2++; 
         }
         return p1 ; 
    }
}
    
