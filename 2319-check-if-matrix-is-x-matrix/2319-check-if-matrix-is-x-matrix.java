class Solution {
    public boolean checkXMatrix(int[][] grid) {
        
        return checkDial(grid);
        
    }
     public  boolean checkDial(int[][] res) {
        int count = 0;
        for (int i = 0; i < res.length; i++) {

            for (int j = 0; j < res[0].length; j++) {

                if(j == count || j == ((res[0].length - 1) -count) ){
                    if(res[i][j] == 0)
                        return false;
                }
                else{
                    if(res[i][j] != 0)
                        return false;
                }

            }
            count++;
        }
        return true;
    }
}