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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int x = head.val;
        head = head.next;
        List<Integer> list = new ArrayList<>();
        int idx = 1;
        int min = Integer.MAX_VALUE;
        while(head != null && head.next != null){
            idx++;
            
            int y = head.val;
            int z = head.next.val;
            if(y > x && y > z || y < x && y < z)
                list.add(idx);
            if(list.size()>= 2)
                min = Math.min(min, list.get(list.size()-1) - list.get(list.size()-2));
            x = y;
            head = head.next;
        }
        if(list.size() < 2)
            return new int[]{-1, -1};
        return new int[]{min, list.get(list.size()-1) - list.get(0)};
                         
    }
}