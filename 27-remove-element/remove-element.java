class Solution {
    public int removeElement(int[] nums, int val) {
        
        int p1 = 0 ; 
        int p2 = 0 ; 

        while(p2< nums.length ){
            
            if(nums[p2] == val ) p2++ ; 
            else {
                int k = nums[p1]; 
                nums[p1] = nums[p2]; 
                nums[p2] = k ; 
                p1++;
                p2++;
            }
        }

        return p1; 
    }

    // in this question we have to replace the val from the array, so we have 
    // taken 2 pointer, remove in such a way that after removing all the 
    //non(val) value should appear at the first part of the array, so we have 
    //taken 2 pointer such that will exchaneg the value of ptr when p1 is at 
    //val and p2 is non val after that return p1 the number of non val value 
}