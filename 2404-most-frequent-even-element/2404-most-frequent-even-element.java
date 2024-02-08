class Solution {
    public int mostFrequentEven(int[] nums) {
        int max = Integer.MIN_VALUE;
        Map<Integer, Integer> map = new HashMap<>();
        int res = -1;
        for(int i: nums){
            if(i % 2 == 0)
                 map.put(i, map.getOrDefault(i, 0)+1);
        }
           
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            if(entry.getValue() > max){
                res = entry.getKey();
                max = entry.getValue();
            }
            else if(entry.getValue() == max && entry.getKey() < res){
                res = entry.getKey();
            }
        }
        return res;
    }
}