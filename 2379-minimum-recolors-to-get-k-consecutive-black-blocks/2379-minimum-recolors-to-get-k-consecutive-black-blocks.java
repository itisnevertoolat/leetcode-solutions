class Solution {
    public int minimumRecolors(String blocks, int k) {
        int bCount = 0;
        int wCount = 0;
        int res = Integer.MAX_VALUE;
        for(int i=0;i<k;i++){
            if(blocks.charAt(i) == 'W')
                wCount++;
        }
        res = Math.min(res, wCount);
        int lastIndex = k;
        for(int i=k;i<blocks.length();i++){
            if(blocks.charAt(bCount++) == 'W')
                wCount--;
            if(blocks.charAt(lastIndex++) == 'W')
                wCount++;
            res = Math.min(res, wCount);
        }
        return res;
    }
}