class Solution {
    
    public int hardestWorker(int n, int[][] logs) {
        int time = logs[0][1] - 0, res = logs[0][0];
        for(int i=1;i<logs.length;i++){
            int temTime = logs[i][1] - logs[i-1][1];
            if(temTime > time){
                time = temTime;
                res = logs[i][0];
            }
            else if(temTime == time){
                if(logs[i][0] < res)
                    res = logs[i][0];
            }
        }
        return res;
    }
}