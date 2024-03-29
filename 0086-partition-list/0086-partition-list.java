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
    public ListNode partition(ListNode head, int x) {
        if(head == null || head.next == null)
            return head;
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        ListNode tmp = head;
        while(tmp != null){
            if(tmp.val < x)
                list.add(tmp.val);
            tmp = tmp.next;
        }
        tmp = head;
        while(tmp != null){
            if(tmp.val >= x)
                list2.add(tmp.val);
            tmp = tmp.next;
        }
        ListNode res;
        int i = 0;
        int j = 0;
        if(list.size() > 0){
            res = new ListNode(list.get(0));
            i++;
        }else{
            res = new ListNode(list2.get(0));
            j++;
        }
        tmp = res;
        for(;i<list.size();i++){
            tmp.next = new ListNode(list.get(i));
            tmp = tmp.next;
        }
        for(;j<list2.size();j++){
            tmp.next = new ListNode(list2.get(j));
            tmp = tmp.next;
        }
        return res;
    }
}