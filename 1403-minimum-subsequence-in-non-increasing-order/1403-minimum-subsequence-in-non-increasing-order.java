class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        List<Integer> res = new ArrayList<>();
        int sum1 = 0;
        int sum2= 0;
        for(int i=0;i<nums.length;i++)
            sum1 += nums[i];
        Arrays.sort(nums);
        for(int i=nums.length-1;i>=0;i--){
            if(sum2 > sum1)
                break;
            else{
                sum2 += nums[i];
                sum1 -= nums[i];
                res.add(nums[i]);
            }
        }
        return res;
    }
}