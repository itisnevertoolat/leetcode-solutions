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
    public ListNode removeNodes(ListNode head) {
        ListNode temp = head;
        Stack<ListNode> stack = new Stack<>();
        List<ListNode> list = new ArrayList<>();
        stack.add(temp);
        temp = temp.next;
        while(temp != null){
            while(stack.size() > 0){
                ListNode curr = stack.peek();
                if(temp.val > curr.val){
                    stack.pop();
                }else
                    break;
            }
            stack.add(temp);
            temp = temp.next;
        }

        while(stack.size() > 0){
            list.add(stack.pop());
        }
        Collections.reverse(list);
        ListNode res2 = new ListNode(list.get(0).val);
        ListNode res = res2;
        for(int i=1;i<list.size();i++){
            res.next = new ListNode(list.get(i).val);
            res = res.next;
        }
        
        return res2;
    }
}