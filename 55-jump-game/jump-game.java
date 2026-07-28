class Solution {
    public boolean canJump(int[] nums) {
        int maxJump = 0;

        for (int i = 0; i < nums.length; i++) {
            if (maxJump == nums.length - 1)
                return true;
            if (nums[i] == 0) {
                if (maxJump <= i) {
                    return false;
                }
            }
            maxJump = Math.max(maxJump, (i + nums[i]));
        }

        return true;
    }
}