class Solution {
    public int minStartValue(int[] nums) {
        int sum = 0, smallest=0;
        for(int j: nums){
            sum += j;
            smallest = Math.min(sum, smallest);
        }
        if(smallest == 0)
            return 1;
        else
            return (smallest * -1) + 1;
    }
}