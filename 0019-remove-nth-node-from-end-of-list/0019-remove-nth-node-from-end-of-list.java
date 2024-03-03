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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fakeHead = head;
        int listLength = 1;
        while(fakeHead.next != null) {
            listLength++;
            fakeHead = fakeHead.next;
        }
        if(n == listLength) {
            head = head.next;
            return head;
        }
        int nodeToRemove = listLength - n;
        fakeHead = head;
        for(int i=0; fakeHead.next!=null && i<nodeToRemove-1; i++){
            fakeHead = fakeHead.next;
        }
        fakeHead.next = fakeHead.next.next;
        return head;
    }
}