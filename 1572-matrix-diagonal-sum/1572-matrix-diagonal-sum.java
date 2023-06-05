class Solution {
    public int diagonalSum(int[][] mat) {
        int primaryI = 0;
        int primaryJ = 0;
        int secondaryJ = mat.length-1;
        int sum =0;
        for(int i=0;i<mat.length;i++){
            if(primaryJ==secondaryJ) {
                sum += mat[primaryI][primaryJ];
                }
            else{
                sum += mat[primaryI][primaryJ];
                sum += mat[primaryI][secondaryJ];
            }
            primaryI++;
            primaryJ++;
            secondaryJ--;
        }
        return sum;
    }
}