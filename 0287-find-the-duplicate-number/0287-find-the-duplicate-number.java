class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int slow = 0;
        int fast = 1;
        for(int i=0;i<nums.length - 1;i++){
            if(nums[slow++] == nums[fast++])
                return nums[slow];
        }
        return 0;
    }
}