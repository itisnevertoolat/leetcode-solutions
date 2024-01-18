class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        for(int i=0;i<matrix.length-1;i++){
            for(int j=i+1;j<i+2;j++){
                for(int k=0;k<matrix[i].length-1;k++){
                    int x = matrix[j][k+1];
                    if(matrix[i][k] == x)
                        continue;
                    else
                        return false;
                }
            }
                
            }
        return true;
        }
        
    }
