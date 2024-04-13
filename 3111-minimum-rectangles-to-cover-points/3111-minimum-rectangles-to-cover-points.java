class Solution {
    public int minRectanglesToCoverPoints(int[][] points, int w) {
        int total=0;
        Arrays.sort(points,(a,b)->a[0]-b[0]);
        int i=0;
        int n=points.length;
        while(i<n){
            int j=i;
            while(j<n&&points[j][0]-points[i][0]<=w) j++;
            total++;
            i=j;
        }
        return total;
    }
}