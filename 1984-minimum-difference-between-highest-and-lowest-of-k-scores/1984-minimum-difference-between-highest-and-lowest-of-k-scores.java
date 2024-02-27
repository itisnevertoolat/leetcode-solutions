class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int res = Integer.MAX_VALUE;
        if(k==1)
            return 0;
        int lastIndex = k - 1;
        for(int i=0;lastIndex<nums.length;i++){
            int x = nums[lastIndex++] - nums[i];
            res = Math.min(res, x);
        }
        return res;
        
    }
}