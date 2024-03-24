class Solution {
    public int findDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i: nums){
            int x = map.getOrDefault(i, 0) + 1;
            if(x==2)
                return i;
            map.put(i, x);
        }
        return 0;
    }
}