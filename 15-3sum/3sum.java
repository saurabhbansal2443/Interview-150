class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();

        Arrays.sort(nums);
        HashSet<String> hs = new HashSet<>();

        int tar = 0;

        for (int i = 0; i < nums.length; i++) {

            int si = i + 1;
            int ei = nums.length - 1;

            while (si < ei) {
                if (nums[si] + nums[ei] + nums[i] > 0) {
                    ei--;

                } else if (nums[si] + nums[ei] + nums[i] < 0) {
                    si++;

                } else {

                    int a = nums[i], b = nums[si], c = nums[ei];
                    String key = makeHash(a, b, c);
                    if (!hs.contains(key)) {
                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[si]);
                        temp.add(nums[ei]);

                        ans.add(temp);
                        hs.add(key);
                    }
                    ei--;
                    si++;

                }
            }
        }
        return ans;
    }

    public String makeHash(int x, int y, int z) {
        int[] arr = new int[] { x, y, z };
        Arrays.sort(arr);
        return arr[0] + "#" + arr[1] + "#" + arr[2];
    }
}