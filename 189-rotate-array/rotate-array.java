class Solution {
    public void rotate(int[] nums, int k) {

        k = k%nums.length ; 

        if (k == 0 || k == nums.length) {
            return;
        }

        reverse(nums, 0, nums.length - k - 1);
        reverse(nums, nums.length - k, nums.length - 1);
        reverse(nums , 0, nums.length - 1);

    }

    public void reverse(int[] nums, int start, int end) {

        while (start < end) {
            int k = nums[start];
            nums[start] = nums[end];
            nums[end] = k;
            start++;
            end--;
        }
    }
}