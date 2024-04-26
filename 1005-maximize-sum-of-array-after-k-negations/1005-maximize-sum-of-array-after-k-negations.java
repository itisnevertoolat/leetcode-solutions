class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        while(k-- > 0){
            Arrays.sort(nums);
            nums[0] *= -1;
        }
        int sum = 0;
        for(int i: nums)
            sum += i;
        return sum;
    }
}