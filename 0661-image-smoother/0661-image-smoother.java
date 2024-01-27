class Solution {
    public int[][] imageSmoother(int[][] img) {
        int row = img.length, col = img[0].length;
        int[][] res = new int[img.length][img[0].length];
        for(int r=0;r<row;r++){
            for(int c=0;c<col;c++){
                int totalSum = 0, cnt = 0;
                for(int i=r-1;i<r+2;i++){
                    for(int j=c-1;j<c+2;j++){
                        if(i<0 || i==row || j<0 || j==col)
                            continue;
                        totalSum += img[i][j];
                        cnt++;
                    
                    }
                }
                res[r][c] = (totalSum / cnt);
            }
        }
        return res;
    }
}