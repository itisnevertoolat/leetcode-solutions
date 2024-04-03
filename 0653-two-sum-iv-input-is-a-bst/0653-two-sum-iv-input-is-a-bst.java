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
    public boolean findTarget(TreeNode root, int k) {
        
        postTrav(root);
        int left = 0;
        int right = list.size() -1;
        while(left < right){
            int x = list.get(left) + list.get(right);
            if(x ==k)
                return true;
            else if(x > k)
                right--;
            else
                left++;
        }
       return false;
        
    }
    public void postTrav(TreeNode root){
        if(root == null)
            return;
        postTrav(root.left);
        list.add(root.val);
        postTrav(root.right);
        
    }
}