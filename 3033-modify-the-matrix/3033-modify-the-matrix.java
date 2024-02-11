class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
       List<Integer> list = new ArrayList<>();
        for(int i=0;i<matrix[0].length;i++){
            int max = Integer.MIN_VALUE;
            list = new ArrayList<>();
            for(int j=0;j<matrix.length;j++){
                if(matrix[j][i] == -1)
                    list.add(j);
                else
                    max = Math.max(max, matrix[j][i]);
            }
            for(int k: list)
                matrix[k][i] = max;
        }
        return matrix;
    }
}