class Solution {
    public int[] rearrangeArray(int[] nums) {
        int countPos = 0, countNeg = 1;
        int[] res = new int[nums.length];
        for(int i: nums){
            if(i > 0){
                res[countPos] = i;
                countPos += 2;
            }
                
            else{
                res[countNeg] = i;
                countNeg += 2;
            }
                
        }
        return res;
    }
}