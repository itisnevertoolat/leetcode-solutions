class Solution {
    public int[] numberOfPairs(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i: nums){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        int pairs = 0;
        int remain = 0;
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            int x = entry.getValue();
            if( x / 2 > 0){
                pairs += x / 2 ;
            }
            remain += x % 2;
        }
        return new int[] {pairs, remain};
    }
}