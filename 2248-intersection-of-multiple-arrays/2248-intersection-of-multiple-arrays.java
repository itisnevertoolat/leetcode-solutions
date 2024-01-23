class Solution {
    public List<Integer> intersection(int[][] nums) {
        List<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int[] x: nums){
            for(int y: x)
                map.put(y, map.getOrDefault(y, 0)+1);
        }
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            if(entry.getValue() == nums.length)
                list.add(entry.getKey());
        }
        Collections.sort(list);
        return list;
        
    }
}