class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int sum = 0, countZero=0;
        for(int i: arr)
            sum += i;
        if(sum % 3 != 0)
            return false;
        int divSum = sum / 3;
        int num = 0, ans = 0;
        for(int i: arr){
            num += i;
            if(num == divSum){
                num = 0;
                ans++;
            }
                
        }
        
        return ans >= 3;
        
    }
}