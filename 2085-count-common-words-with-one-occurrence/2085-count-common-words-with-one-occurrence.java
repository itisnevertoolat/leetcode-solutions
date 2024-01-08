class Solution {
    public int countWords(String[] words1, String[] words2) {
        Map<String, Integer> map = new HashMap<>();
        int res = 0;
        for(String s: words1)
            if(map.getOrDefault(s, 0) == 0)
                map.put(s, map.getOrDefault(s, 0)+1);
            else
                map.put(s, map.get(s)+1);

        for(String s: words2)
            if(map.getOrDefault(s, 0) == 1)
                map.put(s, map.get(s)-1);
            else
                map.put(s, map.getOrDefault(s, 0)+2);
        for(Map.Entry<String, Integer> entry: map.entrySet())
            if(entry.getValue() == 0)
                res++;
        return res;
    }
}