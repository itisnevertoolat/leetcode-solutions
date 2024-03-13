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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode temp = list1;
        ListNode temp2 = list1;
        ListNode dummy = new ListNode();
        int count = 1;
        int count2 = 0;
        while(temp2 != null){
            if(count2++ == b+1)
                dummy = temp2;
            temp2 = temp2.next;
            
        }
        while(temp != null && temp.next != null){
            if(count++ == a)
                temp.next = list2;
            temp = temp.next;
        }
        temp.next = dummy;
        return list1;
    }
}