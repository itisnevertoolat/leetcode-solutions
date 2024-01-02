class Solution {
    public int countTestedDevices(int[] batteryPercentages) {
        int count = 0;
        for(int i: batteryPercentages){
            if(i - count > 0){
                    count++;
            }
        }
        return count;
    }
}