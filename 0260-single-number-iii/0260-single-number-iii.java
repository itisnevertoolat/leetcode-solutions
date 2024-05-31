class Solution {
    public int[] singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i: nums)
            map.put(i, map.getOrDefault(i, 0)+1);
        int[] res = new int[2];
        int count = 0;
        for(int key: map.keySet())
            if(map.get(key)==1)
                res[count++] = key;
        return res;
    }
}