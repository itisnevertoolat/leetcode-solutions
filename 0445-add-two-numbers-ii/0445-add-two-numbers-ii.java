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
    public ListNode addTwoNumbers(ListNode L1, ListNode L2) {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        Stack<Integer> s3 = new Stack<>();
        while(L1 != null){
            s1.push(L1.val);
            L1 = L1.next;
        }
        while(L2 != null){
            s2.push(L2.val);
            L2 = L2.next;
        }
        int rem = 0;
        int x = 0;
        while(s1.size() > 0 || s2.size() > 0){
            if(s1.size() == 0)
                x = s2.pop() + rem;
            else if(s2.size() == 0)
                x = s1.pop() + rem;
            else
                x = s2.pop() + s1.pop() + rem;
            
            if( x > 9){
                rem = 1;
                x %= 10;
            }else
                rem = 0;
            s3.push(x);
        }

        if(rem == 1)
            s3.push(1);
        ListNode res = new ListNode(s3.pop());
        ListNode tmp = res;
        while(s3.size() > 0){
            tmp.next = new ListNode(s3.pop());
            tmp = tmp.next;
        }
        return res;
    }
}