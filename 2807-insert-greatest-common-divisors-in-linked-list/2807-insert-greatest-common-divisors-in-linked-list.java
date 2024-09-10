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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode temp  = head;
        ListNode prev = new ListNode(temp.val);
        ListNode res1 = new ListNode();
        List<ListNode> list = new ArrayList<>();
        list.add(prev);
        while(temp.next != null){
            ListNode x = prev;
            ListNode y = new ListNode(temp.next.val);
            for(int i = 1; i <= x.val && i <= y.val; i++){
                if(x.val%i==0 && y.val%i==0){
                    res1 = new ListNode(i);
                }
            }
            list.add(res1);
            list.add(y);
            temp = temp.next;
            prev = y;
     
        }
        ListNode res = list.get(0);
        ListNode temp2 = res;
        for(int i=1;i<list.size();i++){
            temp2.next = new ListNode(list.get(i).val);
            temp2 = temp2.next;
        }
        return res;
        
    }
}