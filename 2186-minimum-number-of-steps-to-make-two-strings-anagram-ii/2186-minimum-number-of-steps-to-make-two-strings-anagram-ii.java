class Solution {
    public int minSteps(String s, String t) {
        Map<Character, Integer> map =  new HashMap<>();
        int res = 0;
        for(char c : s.toCharArray())
            map.put(c, map.getOrDefault(c, 0)+1);
            
        for(char c : t.toCharArray())
            map.put(c, map.getOrDefault(c, 0)-1);
        
        for(char c: map.keySet())
            res += Math.abs(map.get(c));
        // for(char c: set)
        //     res += Math.abs(map.getOrDefault(c, 0) - map2.getOrDefault(c, 0));
        
        return res;
    }
}