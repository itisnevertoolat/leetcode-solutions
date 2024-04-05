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

    public int getMinimumDifference(TreeNode root){
        helper(root);
        int res =Integer.MAX_VALUE;
        for(int i=1;i< list.size();i++)
            res = Math.min(res , list.get(i) - list.get(i-1));
        return res;
    }
    public void helper(TreeNode root){
        if(root == null)
            return;
        helper(root.left);
        list.add(root.val);
        helper(root.right);
    }
}