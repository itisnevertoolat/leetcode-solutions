class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        
        Set<String> set = new HashSet<>();
        Map<String, Integer> map = new HashMap<>();
        String res = "";
        int max = -1;
        for(String s: banned)
            set.add(s);
        String test = paragraph.toLowerCase().replaceAll("[!?',;.]+", " ");
        for(String s: test.split(" ")){
            if(!set.contains(s) && !s.equals(""))
                map.put(s, map.getOrDefault(s, 0)+1);
        }
        for(String key: map.keySet()){
            if(map.get(key) > max){
                res = key;
                max = map.get(key);
            }
        }
            
        return res;
        
    }
}