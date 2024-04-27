class Solution {
    public List<Integer> findLonely(int[] nums) {
        List<Integer> res = new ArrayList<>();
        if(nums.length == 1){
            res.add(nums[0]);
            return res;
        }
            
        
        Arrays.sort(nums);
        for(int i=1;i<nums.length-1;i++){
            if(nums[i] - 1 == nums[i-1] || nums[i] + 1 == nums[i+1] || nums[i] == nums[i-1] || nums[i] == nums[i+1])
                continue;
            else
                res.add(nums[i]);
        }
        if(nums[0] +1 != nums[1] 
           && nums[0] != nums[1])
            res.add(nums[0]);
        if(nums[nums.length-2] +1 != nums[nums.length-1] && nums[nums.length-1] != nums[nums.length-2])
            res.add(nums[nums.length-1]);
        return res;
    }
} 