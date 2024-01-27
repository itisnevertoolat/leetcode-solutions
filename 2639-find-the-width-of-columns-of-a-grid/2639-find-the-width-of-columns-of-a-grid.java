class Solution {
    public int[] findColumnWidth(int[][] grid) {
        int[] res = new int[grid[0].length];
        int cnt = 0;
        for(int i=0;i<grid[0].length;i++){
            int max = 1;
            for(int j=0;j<grid.length;j++){
                max = Math.max(max, String.valueOf(grid[j][i]).length());
            }
            res[cnt++] = max; 
        }
        return res;
    }
}