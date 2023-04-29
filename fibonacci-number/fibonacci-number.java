class Solution {
    Map<Integer, Integer> fibonacciCache = new HashMap<>();
    int result;
    public int fib(int n) {
        
        if(fibonacciCache.containsKey(n)){
            return fibonacciCache.get(n);
        }
        else if(2 > n){
            result = n;
        }else{
            result = fib(n-1) + fib(n-2);
        }
        return result;
    }
}