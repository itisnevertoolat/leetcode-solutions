class Solution {
    public int longestPalindrome(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for(char c: s.toCharArray())
            map.put(c, map.getOrDefault(c, 0)+1);
        int res = 0;
        int add = 0;
            
        for(char c: map.keySet()){
            int x = map.get(c);
            res += x  - (x % 2);
            if(x  % 2 != 0)
                add = 1;
        }
        return res + add;
        
    }
}