class Solution {
    public int maxDivScore(int[] nums, int[] divisors) {
        int num = Integer.MAX_VALUE;
        int res = 0;
        for(int i: divisors){
            int count = 0;
            for(int j: nums)
                if(j % i == 0)
                    count++;
            if(count > res){
                res = count;
                num = i;
            }
            else if(count == res){
                num = num < i ? num : i;
            }
        }
        return num;
    }
}