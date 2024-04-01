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
    List<TreeNode> list = new ArrayList<>();
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        helper(root1);
        int size1 = list.size();
        helper(root2);
        int size2 = list.size() -size1;
        if(size1 != size2)
            return false;
        for(int i=0;i<size1;i++){
            if(list.get(i).val != list.get(size1+i).val)
                return false;
        }
        return true;
    }
    public List<TreeNode> helper(TreeNode node){
        
        if(node == null)
            return null;
        if(node.left == null && node.right == null)
            list.add(node);
        helper(node.left);
        helper(node.right);
        return list;
    }
    
        // if(list1.size() != list2.size())
        //     return false;
        // for(int i=0;i<list1.size();i++){
        //     if(list1.get(i).val != list2.get(i).val)
        //         return false;
        // }
        
        
    
}