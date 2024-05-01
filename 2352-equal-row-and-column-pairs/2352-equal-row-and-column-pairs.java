class Solution {
    public int equalPairs(int[][] grid) {
        int[][] columns = getColumns(grid);
        int  res = 0;
        for(int[] row: grid){
            for(int[] col: columns){
                if(Arrays.equals(row, col))
                    res++;
            }
        }
        return res;
        
    }
    
    public int[][] getColumns(int[][] grid){
        int size = grid[0].length;
        int[][] columns = new int[size][size];
        for(int i=0;i<size;i++){
            int[] column = new int[size];
            for(int j=0;j<size;j++){
                column[j] = grid[j][i];
            }
            columns[i] = column;
        }
        return columns;
        
    }
}



// class Solution {
//     public int equalPairs(int[][] grid) {
//         int size = grid[0].length;
//         int[][] columns = new int[size][size];
//         for(int i=0;i<size;i++){
//             int[] column = new int[size];
//             for(int j=0;j<size;j++){
//                 column[j] = grid[j][i];
//             }
//             columns[i] = column;
//         }
//         int  res = 0;
//         for(int[] row: grid){
//             for(int[] col: columns){
//                 if(Arrays.equals(row, col))
//                     res++;
//             }
//         }
//         return res;
        
//     }
// }