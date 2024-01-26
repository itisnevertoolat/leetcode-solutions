class Solution {
    public int[] applyOperations(int[] nums) {
        int[] res = new int[nums.length];
        int count = nums.length-1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i] == nums[i+1]){
                nums[i] = nums[i] * 2;
                nums[i+1] = 0;
                
            }
        }
        List<Integer> list = Arrays.stream(nums).boxed().filter(x -> x != 0).toList();
        for(int i=0;i<list.size();i++)
            res[i] = list.get(i);
        for(int i=list.size();i<nums.length;i++)
            res[i] = 0;
        
        return res;
    }
}