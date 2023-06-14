class Solution {
    public int deleteGreatestValue(int[][] grid) {
        int[][] res = new int[grid[0].length][grid.length];
        int num = 0;
        for(int i=0;i<grid[0].length;i++){
            for(int j=0;j<grid.length;j++){
                Arrays.sort(grid[j]);
                res[i][j] = grid[j][i];
                
            }
        }
        for(int i=0;i<res.length;i++){
            Arrays.sort(res[i]);
            num += res[i][res[i].length-1];
        } 
        
    return num;
    }
}