class Solution {
    public String customSortString(String order, String s) {
        Map<Character, Integer> map2 = new HashMap<>();
        String res = "";
        
        
        for(char c: s.toCharArray()){
            int x = map2.getOrDefault(c ,0)+1;
            map2.put(c, x);
        }
            
        
        for(int i=0;i<order.length();i++){
            char c = order.charAt(i);
            if(map2.containsKey(c)){
                res += Character.toString(c);
                res += Character.toString(c).repeat(map2.get(c)-1);
                map2.remove(c);
                
            }
        }
        
        
        for(char c: map2.keySet()){
                res += Character.toString(c);
                res += Character.toString(c).repeat(map2.get(c)-1);

        }
       
        
        return res;
    }
}