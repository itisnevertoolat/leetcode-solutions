class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int ans = 0;
        for(int i=nums.length-1;i >= 2;i--){
            int sum = nums[i-2] + nums[i-1];
            if(sum > nums[i]){
                int perimeter = sum + nums[i];
                ans= ans > perimeter ? ans : perimeter;
                break;
            }
        }
        return ans;
    }
}