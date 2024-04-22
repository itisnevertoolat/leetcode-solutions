class Solution {
    public int minSteps(String s, String t) {
        Map<Character, Integer> map =  new HashMap<>();
        Map<Character, Integer> map2 =  new HashMap<>();
        int res = 0;
        String word = "zxcvbnmasdfghjklqwertyuiop";
        for(char c : s.toCharArray())
            map.put(c, map.getOrDefault(c, 0)+1);
        for(char c : t.toCharArray())
            map2.put(c, map2.getOrDefault(c, 0)+1);
        for(char c: word.toCharArray())
            res += Math.abs(map.getOrDefault(c, 0) - map2.getOrDefault(c, 0));
        
        return res;
    }
}