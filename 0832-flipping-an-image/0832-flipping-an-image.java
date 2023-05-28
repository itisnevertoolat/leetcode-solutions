class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        int[][] res = new int[n][n];
        for(int i=0;i<n;i++){
            int startP = 0;
            int endP = n-1;
            while(endP >=0){
                if(image[i][endP] == 1) res[i][startP] = 0;
                else res[i][startP] = 1;
                startP++;
                endP--;
                
                
            }
                
            }
        return res;
        }
        
        
    }
