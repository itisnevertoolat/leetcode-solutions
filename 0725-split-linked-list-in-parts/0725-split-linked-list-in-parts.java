class Solution {
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] res = new ListNode[k];

        // Calculate list size (one pass)
        int size = 0;
        ListNode tmp = head;
        while (tmp != null) {
            size++;
            tmp = tmp.next;
        }

        // Determine average and remainder for even distribution
        int avgLen = size / k;
        int mod = size % k;

        // Iterate through the list, creating sublists (one pass)
        int i = 0;
        tmp = head;
        while (tmp != null) {
            ListNode subListHead = new ListNode(tmp.val);
            ListNode subListTail = subListHead;

            // Create a sublist of average length (or average + 1 for remainder)
            for (int j = 1; j < (mod > 0 ? avgLen + 1 : avgLen) && tmp != null; j++) {
                tmp = tmp.next;
                if (tmp != null) {
                    subListTail.next = new ListNode(tmp.val);
                    subListTail = subListTail.next;
                }
            }

            res[i] = subListHead;
            i++;
            mod--; // Decrement remainder counter
            tmp = tmp.next; // Move to the next node for the next sublist
        }

        return res;
    }
}
