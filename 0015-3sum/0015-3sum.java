class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> set = new HashSet<>();
        ArrayList<List<Integer>> res = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int left = i+1;
            int right = nums.length - 1;
            while(left<right){
                int sum = nums[i] + nums[left] + nums[right];
                if(sum == 0){
                    set.add(Arrays.asList(nums[i] , nums[left] , nums[right]));
                    left++;
                    right--;
                }else if(0 > sum) left++;
                else right--;
            }
        }
        res.addAll(set);
        return res;
    }
}