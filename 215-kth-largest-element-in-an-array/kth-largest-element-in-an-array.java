class Solution {
    public int findKthLargest(int[] nums, int k) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int i = 0;
        while (k > 0) {
            pq.add(nums[i]);
            i++;
            k--;
        }

        while (i < nums.length) {
            int ele = nums[i];
            if (ele > pq.peek()) {
                pq.remove();
                pq.add(ele);
            }
            i++;
        }

        return pq.peek();

    }
}