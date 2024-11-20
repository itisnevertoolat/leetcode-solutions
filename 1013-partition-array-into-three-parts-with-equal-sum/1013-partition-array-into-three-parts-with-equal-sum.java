class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int sum = 0, countZero=0, currSum = 0;
        for(int i: arr)
            sum += i;
        if(sum % 3 != 0)
            return false;
        
        int ans = 0, singleArrSum = sum / 3;
        for(int i: arr){
            currSum += i;
            if(currSum == singleArrSum){
                currSum = 0;
                ans++;
            }
                
        }
        
        return ans >= 3;
        
    }
}