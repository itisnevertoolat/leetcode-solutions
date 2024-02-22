class Solution {
    public int findJudge(int n, int[][] trust) {
        if(n == 1)
            return 1;
        Set<Integer> set = new HashSet<>();
        Map<Integer, Integer> map = new HashMap<>();
        for(int[] arr: trust)
            set.add(arr[0]);
        for(int[] arr: trust)
            if(!set.contains(arr[1])){
                int x = map.getOrDefault(arr[1], 0)+1;
                if(x == n - 1)
                    return arr[1];
                map.put(arr[1], x);
                
            }
                
        return -1;
    }
}