class Solution {
    public int longestAlternatingSubarray(int[] nums, int threshold) {
        int res = 0, count = 0;
        for(int i = 0 ;i<nums.length;i++){
            if(nums[i] % 2 == 0 && nums[i] <= threshold){
                count++;
                res = Math.max(res, count);
                if(i + 1 < nums.length){
                    if(nums[i + 1] % 2 == 1 && nums[i+1] <= threshold){
                        i++;
                        count++;
                        }
                    else
                        count = 0;
                }
                 res = Math.max(res, count);
            } else
                count = 0;         
           
        }
        return res;
    }
}