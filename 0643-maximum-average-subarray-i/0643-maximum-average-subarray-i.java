class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0.0;
        for(int i=0;i<k;i++)
            sum += nums[i];
        double res = (sum / k);
        int idx = k;
        for(int i=1;i<nums.length-(k-1);i++){
            sum += nums[idx++];
            sum -= nums[i-1];
            res = Math.max(res, (sum / k));
        }
        return res;
    }
}