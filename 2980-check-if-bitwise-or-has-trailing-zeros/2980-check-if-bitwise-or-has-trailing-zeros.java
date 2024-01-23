class Solution {
    public boolean hasTrailingZeros(int[] nums) {
        int res = 0;
        for(int x : nums){
            if((x & 1) == 0)
                res++;
            if(res == 2)
                return true;
            
        }
        return false;
    }
}