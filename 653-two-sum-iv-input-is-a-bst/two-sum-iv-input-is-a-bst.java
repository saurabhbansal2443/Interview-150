/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean findTarget(TreeNode root, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        getInorder(root, list);

        int start = 0;
        int end = list.size() - 1;

        while (start < end) {

            int sum = list.get(start) + list.get(end);

            if (sum > k) {
                end--;
            } else if (sum < k) {
                start++;
            }else if ( sum == k ){
                return true ; 
            }
        }
        return false ; 
    }

    public void getInorder(TreeNode root, ArrayList<Integer> list) {
        if (root == null) {
            return;
        }

        getInorder(root.left, list);
        list.add(root.val);
        getInorder(root.right, list);

    }
}