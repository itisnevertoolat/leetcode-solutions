/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
 class Solution {
    ListNode fromStart;
    public boolean isPalindrome(ListNode head) {
        fromStart = head;        
        return helper(head);
    }
    
    public boolean helper(ListNode node){
        if(node == null) return true;
        boolean ans = helper(node.next);
        boolean isEqual = (fromStart.val == node.val)? true : false; 
        fromStart = fromStart.next;
        return ans && isEqual;
    }
}