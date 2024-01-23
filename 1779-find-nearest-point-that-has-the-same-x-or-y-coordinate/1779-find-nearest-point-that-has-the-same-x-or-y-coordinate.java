class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int[] arr: points){
            if(arr[0] == x||arr[1] == y){
                int sum = Math.abs(arr[0] - x ) + Math.abs(arr[1] - y);
                map.put(count, sum);
            }
            count++;
        }
        if(map.size() > 0){
            int min = map.values().stream().sorted().toList().get(0);
            for(Map.Entry<Integer, Integer> entry: map.entrySet()){
                if(entry.getValue() == min)
                    return entry.getKey();
            }
        }

        return -1;
    }
}