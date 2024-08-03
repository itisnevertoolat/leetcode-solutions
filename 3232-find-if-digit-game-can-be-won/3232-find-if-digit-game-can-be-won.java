class Solution {
    public boolean canAliceWin(int[] nums) {
        int singleSum = 0, doubleSum = 0;
        for(int i: nums){
            if(i < 10)
                singleSum += i;
            else
                doubleSum += i;
        }
        return singleSum != doubleSum;
    }
}