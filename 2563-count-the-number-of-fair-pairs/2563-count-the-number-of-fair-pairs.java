class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        
        Arrays.sort(nums);
        long res = 0;
        int right = nums.length - 1;
        int lastIdx = nums.length - 1;
        for(int i=0;i<nums.length;i++){
            int left = i;
            
            int largeIdx = 0;
            int smallIdx = 0;
            while(right > i){
                int num = nums[i] + nums[right];
                if(num > upper)
                    right--;
                else{
                    largeIdx = right;
                    break;
                }                    
            }
            left = i+1;
            if(left > lastIdx)
                smallIdx = left;
            while(left <= lastIdx){
                int num = nums[i] + nums[left];
                if(num < lower)
                    left++;
                else{
                    smallIdx = left;
                    break;
                }                    
            }
            if(smallIdx != 0 && largeIdx != 0)
                res += (largeIdx  - smallIdx) + 1;
            
    }
        return res;
    }
}