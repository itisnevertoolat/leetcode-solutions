class Solution {
    public int countPoints(String rings) {
        Map<Integer, Set<Character>> map = new HashMap<>();
        int res = 0;
        for(int i=0;i<10;i++){
            map.put(i, new HashSet<>());
        }
        
        for(int i=1;i<rings.length();i +=2){
            int d = Integer.parseInt(rings.charAt(i)+"");
            map.get(d).add(rings.charAt(i-1));
        }
        
        for(int i=0;i<10;i++){
           if(map.get(i).size() == 3) res++;
        }
        return res;
    }
}