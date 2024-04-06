class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int[] res = new int[nums.length];
        int count = 0, sum =  0;
        for(int i: nums)
            sum += i % 2 == 0 ? i : 0;
        
        for(int[] query : queries){            
            if(nums[query[1]] % 2 == 0)
                sum -= nums[query[1]];
            
             nums[query[1]] += query[0];
            
            if(nums[query[1]] % 2 ==0)
                sum += nums[query[1]];
            res[count++] = sum;
        }
        return res;
        
    }
    // public int evenCal(int[] arr){
    //     int sum =  0;
    //     for(int i: arr)
    //         if(i % 2 == 0)
    //             sum += i;
    //     return sum;
    // }
    
}