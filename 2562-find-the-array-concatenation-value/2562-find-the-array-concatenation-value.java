class Solution {
    public long findTheArrayConcVal(int[] nums) {
        long res = 0;
        int start = 0;
        int end = nums.length -1;
        StringBuilder sb;
        while(end >= start){
            sb =  new StringBuilder();
            sb.append(nums[start]);
            sb.append(nums[end]);
            res += end == start ? Integer.valueOf(nums[start]) :
                Integer.valueOf(sb.toString());
            start++;
            end--;
        }
        return res;
    }
}