class Solution {
    public int removeElement(int[] nums, int val) {
        int start = 0 ; 
        int end = 0 ; 

        while(end< nums.length){
            
            if(nums[end] == val ){
                end++; 
            }else{
                int k = nums[start]; 
                nums[start] = nums[end]; 
                nums[end] = k ; 
                start++; 
                end++; 
            }
        }
        return start ; 
    }
}