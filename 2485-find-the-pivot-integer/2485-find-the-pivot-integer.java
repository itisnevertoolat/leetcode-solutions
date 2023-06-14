class Solution {
    int outSum = 0;
    int sum = 0;

    public int pivotInteger(int n) {
        for(int i=1;i<=n;i++){
            sum += i;
        }
        for(int i=1;i<=n;i++){
            outSum += i;

            if(outSum == sum - (outSum - i)){
                return i;
            }

        }
        return -1;
    }
}