class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for(int i: nums){
            int x = map.getOrDefault(i, 0) + 1;
            if(x==2)
                list.add(i);
            map.put(i, x);
        }
        return list;
    }
}