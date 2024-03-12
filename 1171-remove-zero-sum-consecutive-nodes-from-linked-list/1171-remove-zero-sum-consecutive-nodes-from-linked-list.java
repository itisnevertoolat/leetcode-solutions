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
    public ListNode removeZeroSumSublists(ListNode head) {
        ListNode temp = head;
        ListNode prev = head;
        int size=0;
        while(temp != null){
            size++;
            temp = temp.next;
        }
        temp = head;
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = temp.val;
            temp = temp.next;
        }
        int sum = 0;
        int j= 0;
        for(int i=0;i<size;i++){
            sum = 0;
            for(j=i;j<size;j++){
                sum += arr[j];
                if(sum == 0)
                    break;
            }
            if (sum == 0)
                for (int k = i; k <= j; k++)
                    arr[k] = 0;
        }
        temp = head;
        int flag = 0;
        
        for(int i=0;i<size;i++){
            if (arr[i] != 0) {
                flag = 1;
                prev = temp;
                temp.val = arr[i];
                temp = temp.next;
            }
            
        }
        prev.next = null;
        
        if (flag == 0) {
            head = null;
            return head;
        }
        return head;
    }
}