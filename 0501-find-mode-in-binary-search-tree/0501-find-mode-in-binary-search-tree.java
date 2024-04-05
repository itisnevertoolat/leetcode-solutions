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
    Map<Integer, Integer> map = new HashMap<>();
    int x = 0;
    public int[] findMode(TreeNode root) {
        helper(root);
        List<Integer> list =  new ArrayList<>();
        for(int key: map.keySet())
            if(map.get(key)==x)
                list.add(key);
        int[] res = new int[list.size()];
        int count = 0;
        for(int i: list)
            res[count++] = i;
        return res;

        
    }
    public void helper(TreeNode node){
        if(node==null)
            return;
        helper(node.left);
        helper(node.right);
        map.put(node.val, map.getOrDefault(node.val, 0)+1);
        x = Math.max(x, map.get(node.val));
        
    }
}