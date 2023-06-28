class Solution {
    public int minOperations(int[] nums) {
        int res = 0;
        for(int i=0;i< nums.length-1;i++){
            if(nums[i+1] <= nums[i]){
                int n = (nums[i] - nums[i+1]) + 1;
                res += n;
                nums[i+1] = nums[i+1] + n; 
            } 
        }
        return res;
    }
}