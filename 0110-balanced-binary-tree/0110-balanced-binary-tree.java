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
    List<Integer> list = new ArrayList<>();
    public boolean isBalanced(TreeNode root) {
        helper(root);
        for(int i: list)
            if(i > 1)
                return false;
        return true;
    }
    public int helper(TreeNode root){
        if(root == null)
            return 0;
        
        int left = helper(root.left);
        int right = helper(root.right);
        int x = right - left;
        list.add(Math.abs(x));
        return Math.max(left, right) +1;
        
    }
}