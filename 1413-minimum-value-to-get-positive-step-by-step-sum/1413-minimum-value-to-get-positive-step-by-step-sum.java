class Solution {
    public int minStartValue(int[] nums) {
        outer: for(int i=1;i<=10000;i++){
            int sum = i;
            for(int j: nums){
                sum += j;
                if(sum < 1)
                    continue outer;
                
            }
            return i;
        }
        return 0;
    }
}