class Solution {
    public int longestConsecutive(int[] nums) {

        if(nums.length == 0 )return 0 ; 

        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            if (hm.containsKey(nums[i])) {
                hm.put(nums[i], hm.get(nums[i]) + 1);
            } else {
                hm.put(nums[i], 1);
            }
        }

        int max = 1;

        for (int key : hm.keySet()) {
            int seq = 1;
            if (!hm.containsKey(key - 1)) {

                while (hm.containsKey(key + seq)) {
                    seq++;
                }

            }

            max = Math.max(max, seq);
        }

        return max; 
    }
}