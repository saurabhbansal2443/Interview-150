class Solution {
    public int search(int[] nums, int target) {
        int ans = -1;

        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[start] <= nums[mid]) { // first part sorted

                if (nums[start] <= target && nums[mid] > target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }

            } else { // second part sorted
                if(nums[mid]<target && nums[end]>= target){
                    start = mid+1 ; 
                }else{
                    end = mid-1 ; 
                }
            }
        }

        return ans ; 
    }
}