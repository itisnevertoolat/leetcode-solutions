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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        Queue<TreeNode> pqQueue = new LinkedList<>();
        pqQueue.add(p);
        pqQueue.add(q);
        while(!pqQueue.isEmpty()){
            TreeNode first = pqQueue.poll();
            TreeNode last = pqQueue.poll();
            if(first == null && last == null){
                continue;
            }else if(first == null || last == null || first.val != last.val){
                return false;
            }else{
                pqQueue.add(first.left);
                pqQueue.add(last.left);
                pqQueue.add(first.right);
                pqQueue.add(last.right);


                
            }
        }
        return true;

}
}