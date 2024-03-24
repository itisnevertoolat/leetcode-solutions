class Solution {
    public int minOperations(int k) {
        if(k ==1)
            return 0;
        int min = Integer.MAX_VALUE;
        
        for(int i=1;i<=k;i++){
            int res = 0;
            res += (int) Math.ceil(k / (double) i);
            res += (i - 2);
            min = Math.min(res, min);
        }
        return min;
        
    }
}
//ceil(k/a) and then adding (a-1)+(ceil(k/a)-1)