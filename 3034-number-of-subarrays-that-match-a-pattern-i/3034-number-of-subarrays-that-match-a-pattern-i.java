class Solution {
    public int countMatchingSubarrays(int[] nums, int[] pattern) {
        List<Integer> list = new ArrayList<>();
        int ans = 0;
        for(int i=1;i<nums.length;i++){
            int x = nums[i] - nums[i-1];
            if(x > 0)
                list.add(1);
            else if(x < 0)
                list.add(-1);
            else
                list.add(0);
            
        }
        outer: for(int i=0;i<list.size()-(pattern.length-1);i++){
            int count = 0;
            for(int j=i;j<i+pattern.length;j++){
                if(pattern[count++] != list.get(j))
                    continue outer;
            }
            ans++;
        }
        return ans;
    }
}