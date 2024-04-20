class Solution {
    public int findClosestNumber(int[] nums) {
        Arrays.sort(nums);
        int res = nums[0], dist = Integer.MAX_VALUE;
        for(int i: nums){
            if(i==0)
                return 0;
            if(Math.abs(i) - 0 <= dist){
                res = i;
                dist = Math.abs(i) - 0;
            }
        }
        return res;
    }
}