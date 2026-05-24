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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null ) return ans ; 
        List<Integer> temp = new ArrayList<>();
        Queue<TreeNode> main = new ArrayDeque<>();
        Queue<TreeNode> helper = new ArrayDeque<>();
        main.add(root);
        while (main.size() > 0) {
            TreeNode n = main.remove();
            temp.add(n.val);
            if (n.left != null) {
                helper.add(n.left);
            }
            if (n.right != null) {
                helper.add(n.right);
            }
            if (main.size() == 0) {
                main = helper;
                helper = new ArrayDeque<>();
                ans.add(temp);
                temp = new ArrayList<>();
            }
        }
        return ans;
    }
}