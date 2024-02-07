class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();
        Set<Character> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        for(char c: s.toCharArray())
            map.put(c, map.getOrDefault(c, 0)+1);
        List<Integer> list = map.values().stream().sorted(Comparator.reverseOrder()).toList();
        for(int i:list){
            for(Map.Entry<Character, Integer> entry: map.entrySet()){
                if(entry.getValue() == i){
                    sb.append((entry.getKey()+"").repeat(i));
                    map.put(entry.getKey(),0);
                }
            }
        }
        return sb.toString();
    }
}