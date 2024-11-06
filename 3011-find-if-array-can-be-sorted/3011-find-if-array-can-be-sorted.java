class Solution {
    public boolean canSortArray(int[] nums) {
        boolean res = true;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i] > nums[j]){
                    if(Integer.bitCount(nums[i]) == Integer.bitCount(nums[j])){
                        int temp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = temp;
                        break;
                    }else
                        return false;

                }else
                    continue;
            }
        }
        return res;
    }
}