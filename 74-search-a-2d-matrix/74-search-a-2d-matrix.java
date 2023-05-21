class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int startOuter = 0;
        int endOuter = matrix.length -1 ;

        while(startOuter <= endOuter){
            int midOuter = (endOuter + startOuter) >>> 1;
            if(matrix[midOuter][0] == target){
                return true;
            }
            if(matrix[midOuter][0] > target){
                endOuter = midOuter -1;
            }else{
                int startInner = 0;
                int endInner = matrix[0].length - 1;
                while(startInner <= endInner){
                    int midInner = (endInner + startInner) >>> 1;
                    if(matrix[midOuter][midInner] == target){
                        return true;
                    }else if(matrix[midOuter][midInner] <  target) startInner = midInner+1;
                    else endInner = midInner - 1;
                }
                startOuter = midOuter + 1;
            }
        }
        return false;
    }
}