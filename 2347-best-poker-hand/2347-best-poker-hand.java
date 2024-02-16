class Solution {
    public String bestHand(int[] ranks, char[] suits) {
        Set<Character> set = new HashSet<>();
        for(char c: suits)
            set.add(c);
        if(set.size() == 1)
            return "Flush";
        Map<Integer, Integer>  map = new HashMap<>();
        int x;
        int res = 0;
        for(int i: ranks){
            x = map.getOrDefault(i, 0) + 1;
            if(x == 3)
               return  "Three of a Kind";
            if(x == 2)
               res = 2;
            map.put(i, x);
        }
        if(res == 2)
            return  "Pair";
        
        return "High Card";
        
    }
}