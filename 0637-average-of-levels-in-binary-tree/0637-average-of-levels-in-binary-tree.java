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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int size = 0;
        double sum;
        while(!queue.isEmpty()){
             size = queue.size();
            sum = 0.0;
            for(int i=0;i<size;i++){
                TreeNode tmp = queue.poll();
                sum += tmp.val;
                if(tmp.left != null)
                    queue.add(tmp.left);
                    
                if (tmp.right != null)
                    queue.add(tmp.right);
                
                    
            }
            res.add(sum / size);
            
        }
        return res;
        
    }
}