class Solution {
    public int maxSum(int[] nums) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        int res = -1;
        for(int i: nums)
            map.computeIfAbsent(getMax(i), k -> new ArrayList<>()).add(i);
        for(int i: map.keySet()){
            if(map.get(i).size() == 1)
                continue;
            else{
                List<Integer> list = map.get(i);
                Collections.sort(list);
                int x = list.get(list.size()-1) + list.get(list.size()-2);
                res = res < x ? x : res;
            }
        }
        return res;
    
        
    }
    public  Integer getMax(int x){
        int max = Integer.MIN_VALUE;
        while(x > 0){
            max = max < x % 10 ? x % 10 : max;
            x /= 10;

        }
        return max;

    }
}