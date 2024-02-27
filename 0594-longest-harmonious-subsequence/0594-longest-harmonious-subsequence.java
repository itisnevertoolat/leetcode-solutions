class Solution {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        Map<Integer, Integer> map = new HashMap<>();
        int res = 0;
        for(int i: nums)
            map.put(i, map.getOrDefault(i, 0)+1);
        for(int i=1;i<nums.length;i++){
            int a = nums[i];
            int b = nums[i-1];
            if(a == b)
                continue;
            else if(a - (b) == 1){
                int x = map.get(a) + map.get(b);
                res = Math.max(res, x);
            }

        }
        return res;
    }
}