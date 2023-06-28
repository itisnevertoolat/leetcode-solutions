class Solution {
    public int countGoodRectangles(int[][] rectangles) {
        int res = 0;
        int max = 0;
        for(int i=0;i<rectangles.length;i++){
            int n = Math.min(rectangles[i][0], rectangles[i][1]);
            if (max < n) max = n;
        }
        for(int i=0;i<rectangles.length;i++){
            int n = Math.min(rectangles[i][0], rectangles[i][1]);
            if (max == n) res++;
        }
        return res;
    }
}