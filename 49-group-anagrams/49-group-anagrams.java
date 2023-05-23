class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        List<List<String>> values = new ArrayList<>();
        for(String i: strs){
            int[] hash = new int[26];
            for(char c: i.toCharArray()){
                hash[c - 'a']++;
            }
            String key = Arrays.toString(hash);
            map.computeIfAbsent(key, k -> new ArrayList<>());
            map.get(key).add(i);
        }
        values.addAll(map.values());
        return values;
        
    }
    
}