class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        long res = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] + nums[i] > upper) {
                break;
            }
            int largeIdx = binarySearch(nums, i + 1, nums.length - 1, nums[i], upper);

            int smallIdx = binarySearch(nums, i + 1, nums.length - 1, nums[i], lower - 1);

            res += largeIdx - smallIdx;
        }

        return res;
    }

    private int binarySearch(int[] nums, int left, int right, int target, int upperBound) {
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] + target <= upperBound) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left - 1;
    }
}