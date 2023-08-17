class Solution {
    public int findMaxK(int[] nums) {
        Arrays.sort(nums);
        int start = 0;
        int end  = nums.length - 1;
        while(end > start){
            int x = -1 * nums[start];
            if(x == nums[end])
                return nums[end];
            if(x > nums[end])
                start++;
            else
                end--;
        }
        return -1;
    }
}