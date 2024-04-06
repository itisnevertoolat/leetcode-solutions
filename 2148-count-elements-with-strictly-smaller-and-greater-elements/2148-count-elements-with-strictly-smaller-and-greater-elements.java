class Solution {
    public int countElements(int[] nums) {
        Arrays.sort(nums);
        int res = 0;
        for(int i=1;i<nums.length-1;i++){
            int count = 0;
            if(nums[i] > nums[i-1] && nums[i] < nums[i+1])
                res++;
            if(nums[i] > nums[i-1] && nums[i+1] == nums[i]){
                int curr = nums[i];
                while(i < nums.length-1 && nums[i+1] == curr){
                    i++;
                    count++;
                }
                if(i == nums.length-1)
                    break;
                if(nums[i+1] > curr)
                    res += count+1;
                
            }
        }
        return res;
    }
}