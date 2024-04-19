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
    int level = 0, max = Integer.MIN_VALUE, ans=0;
    public int maxLevelSum(TreeNode root) {
        helper(root);
        return ans;
        
    }
    public void helper(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int level_size = queue.size(), sum = 0;
            while (level_size-- != 0) {
                TreeNode temp = queue.poll();
                sum += temp.val;
                if (temp.right != null) queue.add(temp.right);
                if (temp.left != null) queue.add(temp.left);
            }    
            level++;
            if(max < sum){
                max= sum;
                ans = level;
            }
        }
    }
}