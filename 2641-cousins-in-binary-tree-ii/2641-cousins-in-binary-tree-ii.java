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
    public TreeNode replaceValueInTree(TreeNode root) {
        root.val = 0;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            List<TreeNode> list = new ArrayList<>();
            int levelSum = 0;
            int size = q.size();
            for(int i=0;i<size;i++){
                TreeNode curr = q.poll();
                
                 list.add(curr);
                if(curr.left != null){
                    q.add(curr.left);
                   levelSum += curr.left.val;
                }
                if(curr.right != null){
                    q.add(curr.right);
                    levelSum += curr.right.val;
                }

            }
            for(TreeNode node : list){
                int sum = levelSum;
                if(node.left != null)
                    sum -= node.left.val;
                if(node.right != null)
                    sum -= node.right.val;
                if(node.left != null)
                    node.left.val = sum;
                if(node.right != null)
                    node.right.val = sum;
            }
        }
        return root;
    }
}