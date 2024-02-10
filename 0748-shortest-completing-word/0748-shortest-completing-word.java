class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        String res = "t".repeat(16);
        Set<Character> set = new HashSet<>();
        Map<Character, Integer> map = new HashMap<>();
        Map<Character, Integer> map2;
        for(char c: licensePlate.toLowerCase().toCharArray()){
            if(c >= 97 && c <= 122){
                map.put(c, map.getOrDefault(c, 0)+1);
                set.add(c);
            }
                
            
        }
        for(String s: words){
            map2 = new HashMap<>();
            boolean check = true;
            for(char c: s.toCharArray()){
                if(c >= 97 && c <= 122)
                    map2.put(c, map2.getOrDefault(c, 0)+1);
            }
            for(char c: set){
                if(map2.get(c) == null || map.get(c) > map2.get(c)){
                    check = false;
                    break;
                }
            }
            if(check){
                if(res.length() > s.length())
                    res = s;
            }
            
        }
        return res;
        
    }
}