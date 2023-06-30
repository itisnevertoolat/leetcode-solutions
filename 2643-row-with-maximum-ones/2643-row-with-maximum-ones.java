class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int max = 0;
        int idx = 0;
        int ones = 0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                if(mat[i][j]==1) ones++;
            }
            if(ones > max){
                max = ones;
                idx =i;
            }
            ones =0;
            
        }
        return new int[]{idx, max};
    }
}