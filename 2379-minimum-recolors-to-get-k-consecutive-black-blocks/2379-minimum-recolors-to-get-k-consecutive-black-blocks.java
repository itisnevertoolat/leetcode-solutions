class Solution {
    public int minimumRecolors(String blocks, int k) {
        int bCount = 0;
        int wCount = 0;
        int res = Integer.MAX_VALUE;
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<k;i++){
            if(blocks.charAt(i) == 'W')
                wCount++;
            sb.append(blocks.charAt(i));
        }
        res = Math.min(res, wCount);
        for(int i=k;i<blocks.length();i++){
            if(sb.charAt(0) == 'W')
                wCount--;
            if(blocks.charAt(i) == 'W')
                wCount++;
            sb.append(blocks.charAt(i));
            sb.delete(0,1);
                res = Math.min(res, wCount);
        }
        return res;
    }
}