class Solution {
    public int sumOfEncryptedInt(int[] nums) {
    int sum = 0;
    for(int i: nums){


            sum += getLargestNum(i);
        }
        return sum;
    }
    public int getLargestNum(int x){
        int max = Integer.MIN_VALUE;
        int count = 0;
        int res = 0;
        while(x > 0){
            count++;
            max = Math.max(max, x % 10);
            x /= 10;
        }

        for(int i=1;i<=count;i++){
            res += max * Math.pow(10, i-1);
        }
        return res;
    }



}