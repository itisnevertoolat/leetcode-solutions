class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        int res = 0;
        while(k > 0){
            if(k > numOnes && numOnes != 0){
                k -= numOnes;
                res += numOnes;
                numOnes = 0;
            }
            else if(numOnes >= k)
                return k;
            else if(k > numZeros && numZeros != 0){
                k -= numZeros;
                numZeros = 0;
            }
            else if(numZeros >= k)
                return res;
            else if(k > numNegOnes && numNegOnes != 0 ){
                k -= numNegOnes;
                numNegOnes = 0;
                res -= numNegOnes;
            }
            else if(numNegOnes >= k)
                return res -= k;
            
        }
        return res;
    }
}