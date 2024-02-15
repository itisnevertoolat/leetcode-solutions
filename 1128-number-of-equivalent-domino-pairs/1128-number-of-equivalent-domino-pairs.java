class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for(int[] arr: dominoes){
            int max = Math.max(arr[0], arr[1]);
            int min = Math.min(arr[0], arr[1]);
            int num = min * 10 + max;
            int mapValue = map.getOrDefault(num , 0);
            count += mapValue;
            map.put(num, mapValue+1);
            
        }
        
        return count;
        
    }
}