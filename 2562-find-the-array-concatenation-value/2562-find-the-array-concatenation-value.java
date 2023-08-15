class Solution {
    public long findTheArrayConcVal(int[] nums) {
        long res = 0;
        int start = 0;
        int end = nums.length -1;
        while(end >= start){
            
            res += end == start ? Integer.valueOf(nums[start++]) :
                Integer.valueOf(nums[start++]+""+nums[end--]);
        }
        return res;
    }
}