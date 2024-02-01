class Solution {
    public boolean makeEqual(String[] words) {
        if(words.length == 1)
            return true;
       Map<Character, Integer> map = new HashMap<>();
        for(String s: words){
            for(char c: s.toCharArray())
                map.put(c, map.getOrDefault(c, 0)+1);
        }
        for(Map.Entry<Character, Integer> entry: map.entrySet()){
            if(entry.getValue() % words.length != 0)
                return false;
        }
        return true;
    }
}