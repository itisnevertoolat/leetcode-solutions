class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] matrix  = new int[m][n];
        int res = 0;
        for(int i=0;i<indices.length;i++){
            for(int j=0;j<n;j++){
                matrix[indices[i][0]][j]++;
            }
            for(int j=0;j<m;j++){
                matrix[j][indices[i][1]]++;
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j] % 2 != 0) res++;
            }
        }
        return res;
    }
}