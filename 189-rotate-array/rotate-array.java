class Solution {
    public void rotate(int[] nums, int k) {
        int l = nums.length;
        int er = k%l ; 

        reverse(nums , l-er , l-1); 
        reverse(nums,0,l-er-1); 
        reverse(nums,0,l-1); 
    } 
    public void reverse(int[] nums , int ft , int end){
      
        while(ft<end){
            int k = nums[ft]; 
            nums[ft] = nums[end]; 
            nums[end] = k ; 
            ft++; 
            end--; 
        }

    }
}


