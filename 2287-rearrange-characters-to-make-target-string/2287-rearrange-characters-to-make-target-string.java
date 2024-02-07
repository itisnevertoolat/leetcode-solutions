class Solution {
    public int rearrangeCharacters(String s, String target) {
        int res = 0;
        Map<Character, Integer> map = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        Set<Character> set = new HashSet<>();
        for(char c: target.toCharArray()){
            map.put(c, 0);
            map2.put(c, map2.getOrDefault(c, 0)+1);
            set.add(c);
            
        }
            

        for(char c: s.toCharArray())
            if(map.containsKey(c))
                map.put(c, map.get(c)+1);
        
        for(char c: set)
             map.put(c, map.get(c) / map2.get(c));
            
        int x = map.values().stream().sorted().toList().get(0);
        if(x == 0)
            return 0;
        else
            return x;
    }
}