class Solution {
    public int commonFactors(int a, int b) {
        int res = 1;
        int n = Math.min(a,b);
        for(int i=2;i<=n;i++){
            if(a % i == 0 && b % i == 0 ) res++;
        }
        return res;
    }
}