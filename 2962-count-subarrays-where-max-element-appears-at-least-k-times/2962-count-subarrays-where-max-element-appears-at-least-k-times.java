class Solution {
    public long countSubarrays(int[] nums, int k) {
        int maxNum = 0,count = 0, left = 0;
        long res = 0;
        
        for(int i: nums)
            maxNum = Math.max(maxNum, i);
        
        for(int i=0;i<nums.length;i++){
            
            count += nums[i] == maxNum ? 1 : 0;
            
            while(count >= k)
                count -= nums[left++] == maxNum ? 1 : 0;
                
            res += left;
            
        }
        return res;
    }
}