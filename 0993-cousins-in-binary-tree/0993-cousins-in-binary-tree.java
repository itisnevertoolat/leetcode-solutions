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
    TreeNode parentX = null;
    int depthX = 0;
    TreeNode parentY = null;
    int depthY = 0;
    public boolean isCousins(TreeNode root, int x, int y) {
        getDepthAndParent(root, x, y, 0, null);
        return depthX == depthY && parentX != parentY
            ? true: false;
        
    }
    public void getDepthAndParent(TreeNode root, 
                                  int x, int y, int depth, TreeNode parent){
        if(root == null){
            return;
        }
        if(root.val == x){
            parentX = parent;
            depthX = depth;
        }else if(root.val == y){
            parentY = parent;
            depthY = depth;
        }       
        getDepthAndParent(root.left, x, y, depth + 1, root);
        getDepthAndParent(root.right, x, y, depth + 1, root);
    }
   

}