class Solution {
    public int findLucky(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        int max = -1;
        for(int x: arr)
            map.put(x, map.getOrDefault(x, 0)+1);
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            if(entry.getValue() == entry.getKey())
                if(entry.getKey() > max)
                    max = entry.getKey();
        }
        return max;
    }
}