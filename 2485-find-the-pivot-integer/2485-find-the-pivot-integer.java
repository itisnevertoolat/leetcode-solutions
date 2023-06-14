class Solution {
    int outSum = 0;
    int inSum = 0;
    public int pivotInteger(int n) {
        for(int i=1;i<=n;i++){
            outSum += i;
            for(int j = i;j<=n;j++){
                inSum += j;
            }
            if(outSum == inSum){
                return i;
            }

            inSum = 0;
        }
        return -1;
    }
}