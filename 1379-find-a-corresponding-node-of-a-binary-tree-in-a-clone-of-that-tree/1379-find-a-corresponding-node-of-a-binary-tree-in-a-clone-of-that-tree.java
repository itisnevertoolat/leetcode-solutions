/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        Queue<TreeNode> orgQueue = new LinkedList<>();
        Queue<TreeNode> cloQueue = new LinkedList<>();
        orgQueue.add(original);
        cloQueue.add(cloned);
        TreeNode res = new TreeNode();
        TreeNode node;
        while(!orgQueue.isEmpty()){
            node = orgQueue.remove();
            res = cloQueue.remove();
            if(node == target) return res;
            if(node.left != null) orgQueue.add(node.left);
            if(node.right != null) orgQueue.add(node.right);
            if(res.left != null) cloQueue.add(res.left);
            if(res.right != null) cloQueue.add(res.right);
            
        }
        return res;
    }
}