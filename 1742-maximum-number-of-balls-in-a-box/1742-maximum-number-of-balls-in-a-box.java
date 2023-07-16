class Solution {
    public int countBalls(int lowLimit, int highLimit) {
        int n = (highLimit-lowLimit) + 1;
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i=lowLimit;i<=highLimit;i++){
            int j = i;
            int sum = 0;
            while(j > 0){
                sum += j % 10;
                j = j / 10;
            }
            map.put(sum, map.getOrDefault(sum, 0)+1);
        }
        int max = Integer.MIN_VALUE;
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            max = Math.max(entry.getValue(), max);
        }
        return max;
        
        
    }
}