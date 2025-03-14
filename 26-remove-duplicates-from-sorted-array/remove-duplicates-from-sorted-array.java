class Solution {
    public int removeDuplicates(int[] nums) {
        
    if ( nums.length == 1) return 1 ; 

       int p1 = 1 ; 
       int p2 = 1 ; 

       while(p2< nums.length ){

            if(nums[p2] == nums[p2-1]){
                p2++ ; 
            }else{
                nums[p1] = nums[p2]; 
                p1++ ; 
                p2++ ; 
            }
       }

       return p1 ; 
    }
}
// we have to remove the duplicates from a sorted array(now in sorted array the
// dupliactes number comes adjancetly ) so we have taken 2 pointer placed the 
// first pointer on 1 index and check the previous number if they are same that 
// means they are duplicate hence we remove to the number so we just move ptr2 
// so that it can go on some other unique number and then we will replace that 
// number with p1 