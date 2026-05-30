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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();

        if (root == null)
            return ans;

        Queue<TreeNode> main = new ArrayDeque<>();
        Queue<TreeNode> helper = new ArrayDeque<>();

        main.add(root);
        boolean flag = true;
        while (main.size() > 0) {
            TreeNode temp = main.remove();

            if (flag) {
                ans.add(temp.val);
                flag = false;
            }

            if (temp.right != null) {
                helper.add(temp.right);
            }
            if (temp.left != null) {
                helper.add(temp.left);
            }

            if (main.size() == 0) {
                main = helper;
                helper = new ArrayDeque<>();
                flag = true;
            }
        }
        return ans; 
    }
}