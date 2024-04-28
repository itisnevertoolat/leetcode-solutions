class Solution {
    public int minimumAddedInteger(int[] nums1, int[] nums2) {
        int n = nums2.length;
        Arrays.sort(nums2);
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < nums1.length; i++) {
            for (int j = i + 1; j < nums1.length; j++) {
                int[] temp = new int[nums1.length - 2];
                int index = 0;
                for (int k = 0; k < nums1.length; k++) {
                    if (k != i && k != j) {
                        temp[index++] = nums1[k];
                    }
                }
                Arrays.sort(temp);
                Integer curr = null;
                boolean valid = true;
                for (int k = 0; k < n; k++) {
                    int x = nums2[k] - temp[k];
                    if (curr == null) {
                        curr = x;
                    } else if (curr != x) {
                        valid = false;
                        break;
                    }
                }
                if (valid && (curr < res)) {
                    res = curr;
                }
            }
        }
        return res; 
    }
}