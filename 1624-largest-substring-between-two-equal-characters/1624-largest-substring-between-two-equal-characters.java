class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int res = -1;
        for(int i=0;i<s.length();i++){
            if(map.getOrDefault(s.charAt(i), -1) == -1)
                map.put(s.charAt(i), i);
            else{
                int max = i - map.get(s.charAt(i));
                res = Math.max(res, (max - 1));
            }
                
        }
        return res;
    }
}