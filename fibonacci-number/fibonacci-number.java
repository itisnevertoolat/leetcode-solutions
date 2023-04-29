class Solution 
{
    int result;
    Map<Integer, Integer> map = new HashMap<>();
    public int fib(int n)
    {
        if(map.containsKey(n)){
            return map.get(n);
        }
        else if(1>= n){
            return n;
        }else{
            result = fib(n-1) + fib(n-2);
            map.put(n, result);
        }
        return result;
    }
}