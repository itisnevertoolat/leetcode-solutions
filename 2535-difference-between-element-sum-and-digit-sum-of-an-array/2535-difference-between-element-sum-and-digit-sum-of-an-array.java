class Solution {
    public int differenceOfSum(int[] nums) {
        int sum = 0;
        int digitSum = 0;
        for(int i: nums) sum +=i;
        for(int i: nums){
            while(i > 0){
                digitSum += i % 10;
                i /= 10;
            }
        }
        return Math.abs(sum - digitSum);
    }
}