class Solution {
    public int minOperations(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i: nums)
            map.put(i, map.getOrDefault(i, 0)+1);
        int res = 0;
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            Integer x = entry.getValue();
            while(x > 0){
                if(x ==1)
                    return -1;
                else if(x %  2 == 0 && x %  3 == 0)
                    x -= 3;
                else if(x %  2 == 0)
                    x -= 2;
                else
                    x -= 3;
                res++;
                
            }

        
    }
        return res;
    }
}