class Solution {
    public int[] rearrangeArray(int[] nums) {
         int[] positive = new int[nums.length / 2];
        int[] negative = new int[nums.length / 2];
        int[] res = new int[nums.length];
        int countPos = 0, countNeg = 0, count = 0;
        for(int i: nums){
            if(i > 0)
                positive[countPos++] = i;
            else
                negative[countNeg++] = i;
        }
        for(int i=0;i<nums.length;i +=2){
            res[i] = positive[count];
            res[i+1] = negative[count];
            count++;
        }
        return res;
    }
}