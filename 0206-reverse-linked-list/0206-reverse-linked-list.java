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
    public ListNode reverseList(ListNode head) {
        // initialize the new head of the reversed list to be null
        ListNode newHead = null;

        // iterate through the elements in the original list
        while (head != null) {
            // keep a record of the next node in the original list
            ListNode nextNode = head.next;

            // reverse the link between the current node and its next node
            head.next = newHead;

            // move the new head of the reversed list to the current node
            newHead = head;

            // move to the next node in the original list
            head = nextNode;
        }

        // return the new head of the reversed list
        return newHead;
    }
}
