class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> map = new HashMap<>();
        for(char c: ransomNote.toCharArray())
            map.put(c, map.getOrDefault(c, 0)+1);
        for(char c: magazine.toCharArray())
            if(map.containsKey(c))
                map.put(c, map.get(c)-1);
        for(int i: map.values())
            if(i > 0)
                return false;
        
        return true;
        
    }
}