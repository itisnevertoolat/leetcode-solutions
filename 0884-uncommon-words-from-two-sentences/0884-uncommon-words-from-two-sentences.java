class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        Map<String, Integer> map = new HashMap<>();
        List<String> list = new ArrayList<>();
        for(String s: s1.split(" ")){
            map.put(s, map.getOrDefault(s, 0)+1);
        }
        for(String s: s2.split(" ")){
            map.put(s, map.getOrDefault(s, 0)+1);
        }
        for(Map.Entry<String, Integer> entry: map.entrySet()){
            if(entry.getValue() == 1)
                list.add(entry.getKey());
        }
        String[] res = new String[list.size()];
        int count = 0;
        for(String s: list)
            res[count++] = s;
        return res;
    }
}