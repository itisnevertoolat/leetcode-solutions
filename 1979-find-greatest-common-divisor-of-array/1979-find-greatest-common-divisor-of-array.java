class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int res = 0;
        int x = nums[0];
        int y = nums[nums.length-1];
        for(int i=1;i<=x;i++){
            if(x % i==0 &&  y % i ==0) res = i;
        }
        return res;
    }
}