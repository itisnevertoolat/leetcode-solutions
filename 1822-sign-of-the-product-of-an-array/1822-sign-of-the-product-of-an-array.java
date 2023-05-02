class Solution {
    public int arraySign(int[] nums) {
        List<Integer> arr = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 0){
                return 0;
            }else if(nums[i] < 0){
                arr.add(-1);
            }else{
                continue;
            }

        }
        if(arr.size() % 2 == 0){
            return 1;
        }else{
            return -1;
        }
        
    }
}