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
    public ListNode mergeNodes(ListNode head) {
        ListNode temp = head.next;
        ListNode res = new ListNode();
        int sum = 0;
        ListNode temp2 = new ListNode();
        while(temp != null){
            if(temp.val ==0 ){
                if(res.val == 0){ 
                    res = new ListNode(sum);
                    temp2 = res;
                }
                else{
                    temp2.next = new ListNode(sum);
                    temp2 = temp2.next;
                }
                    
                
                sum=0;
            }
            else sum += temp.val;
            temp = temp.next;
            
        }
        return res;
        
    }
}