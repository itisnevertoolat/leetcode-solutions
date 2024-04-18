class Solution {
    public int maximumDifference(int[] nums) {
        int smallest = nums[0], res = -1;
        for(int i=1;i<nums.length;i++){
            if(nums[i] < smallest)
                smallest = nums[i];
            else if(nums[i] > smallest)
                res = Math.max(res, nums[i] - smallest);
        }
            
        // int res = -1;
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[i] < nums[j])
        //             res = Math.max(res, nums[j] - nums[i]);
        //     }
        // }
        return res;
    }
}