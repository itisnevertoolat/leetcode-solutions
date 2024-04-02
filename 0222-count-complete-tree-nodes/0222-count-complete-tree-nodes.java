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
    public int countNodes(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        if(root == null)
            return 0;
        int size = 0;
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode tmp = queue.poll();
            size++;
            if(tmp.left != null)
                queue.add(tmp.left);
            if(tmp.right != null)
                queue.add(tmp.right);
        }
        return size;
        
        
    }
}