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
    PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
    public int findSecondMinimumValue(TreeNode root) {
        helper(root);
        int smallest = priorityQueue.poll();
        while(!priorityQueue.isEmpty()){
            int x = priorityQueue.poll();
            if(x!= smallest)
                return x;
        }

        return -1;
        
    }
    public void helper(TreeNode node){
        if(node == null)
            return;
        helper(node.left);
        helper(node.right);
        priorityQueue.add(node.val);
    }
}