class Solution {
    public int findGCD(int[] nums) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        int res =0;
        for(int e : nums) {
            min = Math.min(e, min);
            max = Math.max(e, max);
        }
        for(int i=1;i<=min;i++){
            if(min % i==0 &&  max % i ==0) res = i;
        }
        return res;
    }
}