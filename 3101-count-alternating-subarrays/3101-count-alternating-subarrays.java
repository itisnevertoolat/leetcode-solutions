class Solution {
    public long countAlternatingSubarrays(int[] nums) {
        if(nums.length ==1)
            return 1;
        long res = 0;
        int left = 0;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1] == nums[i]){
                long n = i - left;
                res += n * (n + 1) / 2;
                left = i;
                
            }
                
                
        }
        long n = nums.length- left;
        res += n * (n + 1) / 2;
        return res;
    }
}