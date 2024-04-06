class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int idx = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                idx = i;
                break;
            }
        }
        int i = idx+1;
        for(;i<nums.length;i++){
            if(nums[i] == 1){
                if((i - idx) -1 < k)
                    return false;
                idx = i;
            }
        }
        return true;
    }
}