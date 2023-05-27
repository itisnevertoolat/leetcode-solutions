class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> res = new ArrayList<>();
        helper(nums, 0, nums.length-1, target, res);
        Collections.sort(res);
        return res;
    }
    public void helper(int[] nums, int left, int right, int target,List<Integer> res){
        if(left > right) return;
        int mid = (right +left) >>>1;
        if(nums[mid] == target) res.add(mid);
        helper(nums, left, mid - 1, target, res);
        helper(nums, mid +1, right, target, res);


    }
}