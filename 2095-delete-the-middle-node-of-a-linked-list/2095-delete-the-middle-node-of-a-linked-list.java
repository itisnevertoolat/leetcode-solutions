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
/*
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        System.gc();
        int mid = 0;
        ListNode tmp = head;
        while(tmp != null){
            mid++;
            tmp = tmp.next;
        }
        if(mid==1)
            return null;
        mid = mid / 2;
        ListNode res = new ListNode(head.val);
        ListNode tmp2 = res;
        head = head.next;
        int count = 0;
        while(head != null){
            if(++count == mid){
                head = head.next;
                continue;
            }
                
            else{
                tmp2.next = new ListNode(head.val);
                tmp2 = tmp2.next;
            }
            head = head.next;
            
        }
        return res;
    }
}
*/