class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        Map<Integer, String> map = new HashMap<>();
        for(int i = 0;i< names.length;i++){
            map.put(heights[i], names[i]);
        }
        Map<Integer, String> sortedMap = new TreeMap<>(Comparator.reverseOrder());
        sortedMap.putAll(map);
        String[] res = new String[names.length];
        int i = 0;
        for(Map.Entry<Integer, String> entry : sortedMap.entrySet()){
            res[i] = entry.getValue();
            i++;
        }
        return res;
    }
}