class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1}; 
        ans[0] = firstOccurence(nums, target); 
         ans[1] = LastOccurence(nums, target);
         return ans ;  
    }

    public int firstOccurence(int[] nums , int target ){
        int ans = -1 ; 
        int start = 0 ; 
        int end = nums.length-1 ; 

        while(start<=end){

            int mid = (start+end)/2; 

            if(nums[mid] == target){
                ans = mid ; 
                end = mid-1 ; 
            }else if(nums[mid]< target){
                start = mid+1 ; 
            }else{
                end = mid-1 ; 
            }

        }

        return ans ; 

    }
    public int LastOccurence(int[] nums , int target ){
         int ans = -1 ; 
        int start = 0 ; 
        int end = nums.length-1 ; 

        while(start<=end){

            int mid = (start+end)/2; 

            if(nums[mid] == target){
                ans = mid ; 
                start = mid+1 ; 
            }else if(nums[mid]< target){
                start = mid+1 ; 
            }else{
                end = mid-1 ; 
            }

        }

        return ans ; 
    }
}