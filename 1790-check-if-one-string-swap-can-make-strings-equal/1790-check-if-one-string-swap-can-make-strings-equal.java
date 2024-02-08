class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if(s1.equals(s2))
            return true;
        int res = 0;
        Map<Character, Integer> map = new HashMap<>();

        for(int i=0;i<s1.length();i++){
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);
            map.put(c1, map.getOrDefault(c1, 0)+1);
            map.put(c2, map.getOrDefault(c2, 0)-1);
        }
        for(Map.Entry<Character, Integer> entry: map.entrySet())
            if(entry.getValue()!= 0)
                return false;
        
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i) != s2.charAt(i))
                res++;
            if(res > 2)
                return false;
        }
        return true;
    }
}