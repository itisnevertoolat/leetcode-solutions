class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int row = grid.length;
        int col = grid[0].length;
        int[][] res = new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                int newCol = (j+k) % col;
                int newRaw = (i+(j+k) / col) % row;
                res[newRaw][newCol] = grid[i][j];
            }
        }
        return (List)Arrays.asList(res);
    }
}