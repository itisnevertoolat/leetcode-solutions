class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int[] res = new int[nums.length];
        int count = 0;
        for(int[] query : queries){
            nums[query[1]] = nums[query[1]] + query[0];
            res[count++] = evenCal(nums);
        }
        return res;
        
    }
    public int evenCal(int[] arr){
        int sum =  0;
        for(int i: arr)
            if(i % 2 == 0)
                sum += i;
        return sum;
    }
    
}