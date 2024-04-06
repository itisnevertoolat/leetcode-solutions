class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i: nums){
            int x = map.getOrDefault(i, 0)+1;
            if(x > 2)
                return false;
            map.put(i, x);
        }
        return true;
        
    }
}