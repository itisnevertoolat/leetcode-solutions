class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        int count = 0;
        for(int i=0;i<m;i++){
            int min = Integer.MAX_VALUE;
            boolean lucky = true;
            for(int j=0;j<n;j++){
                if(matrix[i][j] < min){
                    min = matrix[i][j];
                    count = j;
                }
            }
            for(int j=0;j<m;j++){
                if(j==i)
                    continue;
                else{
                    if(min < matrix[j][count]){
                        lucky = false;
                        break;
                    }
                }
            }
            if(lucky)
                list.add(min);
        }
        return list;
    }
}