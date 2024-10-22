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
    public long kthLargestLevelSum(TreeNode root, int k) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        List<Long> res = new ArrayList<>();
        while(!q.isEmpty()){
            long sum = 0;
            int size = q.size();
            for(int i=0;i<size;i++){
                TreeNode cur = q.poll();
                sum += cur.val;
                if(cur.left != null)
                    q.add(cur.left);
                if(cur.right != null)
                    q.add(cur.right);
                
            }
            res.add(sum);
        }
        Collections.sort(res, Collections.reverseOrder());
        return res.size()  < k ? -1 : res.get(k-1); 
        
    }
}