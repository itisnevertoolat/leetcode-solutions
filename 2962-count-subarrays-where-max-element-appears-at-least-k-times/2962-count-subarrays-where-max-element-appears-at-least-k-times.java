class Solution {
    public long countSubarrays(int[] nums, int k) {
        int maxNum = 0;
        long res = 0;
        for(int i: nums)
            maxNum = Math.max(maxNum, i);
        int count = 0, left = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == maxNum)
                count++;
                while(count >= k){
                    if(nums[left++] == maxNum)
                        count--;
                }
            res += left;
            
        }
        return res;
    }
}