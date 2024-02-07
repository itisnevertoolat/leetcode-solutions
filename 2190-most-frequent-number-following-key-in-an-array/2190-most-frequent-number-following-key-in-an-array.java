class Solution {
    public int mostFrequent(int[] nums, int key) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=1;i<nums.length;i++){
            if(nums[i-1] == key)
                map.put(nums[i], map.getOrDefault(nums[i], 0) +1);
        }
        int max = Integer.MIN_VALUE;
        int res = 0;
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            if(entry.getValue() > max){
                max= entry.getValue();
                res = entry.getKey();
            }
        }
        return res;
    }
}