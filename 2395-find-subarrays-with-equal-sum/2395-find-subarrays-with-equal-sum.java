class Solution {
    public boolean findSubarrays(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length -1;i++){
            int x = nums[i] + nums[i+1];
            int y = map.getOrDefault(x, 0) + 1;
            if(y == 2)
                return true;
            map.put(x, y);
        }
        
        return false;
    }
}