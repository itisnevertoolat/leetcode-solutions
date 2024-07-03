class Solution {
    public int minDifference(int[] nums) {
        int len = nums.length;
        if (len <= 4) {
            return 0;
        }
        Arrays.sort(nums);
        int left = 0, right = len - 4;
        int res = Integer.MAX_VALUE;
        while (right < len) {
            res = Math.min(res, nums[right++] - nums[left++]);
        }
        return res;
    }
}