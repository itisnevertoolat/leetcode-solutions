class Solution {
    
    public double myPow(double x, int n) {
        return n > 0?myRec(x, n):1/myRec(x, -n);
    }
    double myRec(double x, int n){
        if(n==0){
            return 1.0;
        }
        double result = myRec(x, n/2);
        return n % 2 == 0 ? result*result:result*result*x;
    }
}