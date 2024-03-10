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
    public int getDecimalValue(ListNode head) {
        StringBuilder sb = new StringBuilder();
        ListNode node = head;
        int res = 0;
        while(node != null){
            sb.append(node.val);
            node = node.next;
        }
        for(int i=0;i<sb.length();i++){
            res += (sb.charAt(i)-'0') * Math.pow(2, (sb.length()-1 - i));
        }
        return res;
    }
}