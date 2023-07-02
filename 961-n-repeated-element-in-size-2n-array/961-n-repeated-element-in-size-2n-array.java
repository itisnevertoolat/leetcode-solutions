class Solution {
    public int repeatedNTimes(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i:nums){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
            for(Map.Entry<Integer, Integer> entry: map.entrySet()){
                if(entry.getValue() == nums.length / 2) return entry.getKey();
            }
        
        return 0;
    }
}