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
    public ListNode deleteMiddle(ListNode head) {
        if(head.next ==null)
            return null;
        ListNode fast = head;
        ListNode slow = head;
        ListNode res = new ListNode(head.val);
        ListNode temp = res;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast != null && fast.next != null){
                temp.next = new ListNode(slow.val);
                temp = temp.next;
            }

            
        }
        temp.next = slow.next;
        return res;
    }
}
