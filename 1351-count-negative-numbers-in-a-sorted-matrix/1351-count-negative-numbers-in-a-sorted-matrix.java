class Solution {
    public int countNegatives(int[][] grid) {
        int cols = grid[0].length;
        int n = cols - 1;
        int neg = 0;
        for(int i=0;i<grid.length;i++){
            if (grid[i][0] < 0) {
                neg+=cols;
                continue;
            }
            if (grid[i][cols - 1] > 0)
                continue;
            int left = 0;
            int right = n;
            while(left <= right){
                int mid = (right + left) >>> 1;
                if(grid[i][mid] >= 0) left = mid +1;
                else right = mid-1;
            }
            neg += cols - left;
            n = left;
        }
        return neg;
        
    }
}