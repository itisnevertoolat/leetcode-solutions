class Solution {
    public boolean judgeCircle(String moves) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('L', 0);
        map.put('R', 0);
        map.put('U', 0);
        map.put('D', 0);

        for(int i=0;i<moves.length();i++){
            char c = moves.charAt(i);
            map.put(c,map.getOrDefault(c, 0)+1 );
        }
        if(map.get('L') - map.get('R') == 0&& map.get('U') - map.get('D') == 0) return true;
        else return false;
        
        
    }
}