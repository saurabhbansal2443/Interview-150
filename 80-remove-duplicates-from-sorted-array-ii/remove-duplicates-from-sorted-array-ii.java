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

    // in this we have to remove duplicates in sorted array but at most 2 times
    // a element can come at most twice so we are cheking i-2th element is it 
    //same or not and then replacing p1 with p2 only 
}
    
