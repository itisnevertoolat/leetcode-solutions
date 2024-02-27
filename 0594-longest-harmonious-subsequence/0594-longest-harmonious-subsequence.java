class Solution {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        Map<Integer, Integer> map = new HashMap<>();
        int res = 0;
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int x = map.getOrDefault(nums[i], 0);
            if(x == 0)
                list.add(i);
            map.put(nums[i],x+1);
        }
        for(int i=1;i<list.size();i++){
            int a = nums[list.get(i)];
            int b = nums[list.get(i-1)];
            if(a - (b) == 1){
                int x = map.get(a) + map.get(b);
                res = Math.max(res, x);
            }

        }
        return res;
    }
}