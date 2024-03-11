class Solution {
    public String customSortString(String order, String s) {
        Map<Integer, Character> map = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        
        for(int i=0;i<order.length();i++)
            map.put(i, order.charAt(i));
        
        for(char c: s.toCharArray()){
            int x = map2.getOrDefault(c ,0)+1;
            map2.put(c, x);
        }
            
        
        for(int i=0;i<map.size();i++){
            char c = map.get(i);
            if(map2.containsKey(c)){
                sb.append(c);
                sb.append((c+"").repeat(map2.get(c)-1));
                map2.remove(c);
                
            }
        }
        
        
        for(char c: map2.keySet()){
                sb.append(c);
                sb.append((c+"").repeat(map2.get(c)-1));

        }
       
        
        return sb.toString();
    }
}