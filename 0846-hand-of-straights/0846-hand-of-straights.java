class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        Map<Integer, Integer> map = new HashMap<>();
        Arrays.sort(hand);
        for(int i: hand)
            map.put(i, map.getOrDefault(i, 0)+1);
        int res = 0;
        for(int i: hand){
            int x = map.get(i);
            boolean isValid = true;
            int count = groupSize;
            if(x > 0){
                int j = i;
                while(count-- > 0){
                    if(map.containsKey(j)&&map.get(j) > 0){
                        map.put(j, map.get(j)-1);
                    }else{
                        return false;
                    }
                    j++;
                }
                
            }


        }        
        return true;
        
    }
}