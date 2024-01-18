class Solution {
    int result;
    Map<Integer, Integer> map = new HashMap<>();
    public int climbStairs(int n) {
        if(map.containsKey(n)){
            return map.get(n);
        }
        else if(1>= n){
            return 1;
        }else{
            result = climbStairs(n-1) + climbStairs(n-2);
            map.put(n, result);
        }
        return result;
    }
}