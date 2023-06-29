class Solution {
    public int[] distinctDifferenceArray(int[] nums) {
        Set<Integer> pre = new HashSet<>();
        Set<Integer> post = new HashSet<>();
        int[] res = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            pre.add(nums[i]);
            for(int j=i+1;j<nums.length;j++){
                post.add(nums[j]);
            }
            res[i] = pre.size() - post.size();
            post = new HashSet<>();
        }
        return res;
    }
}