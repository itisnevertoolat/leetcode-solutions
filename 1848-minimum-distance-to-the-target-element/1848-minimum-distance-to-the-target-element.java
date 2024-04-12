class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        List<Integer> list = new ArrayList<>();
        int res = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == target){
                int x = Math.abs(i - start);
                res = Math.min(res, x);
            }
        }
        return res;
    }
}