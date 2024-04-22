class Solution {
    public int countEven(int num) {
        int res=0;
        for(int i=1;i<=num;i++)
            if(evenSum(i) % 2 == 0)
                res++;
        
        return res;
        
    }
    public int evenSum(int x){
        int res = 0;
        while(x  > 0){
            res += x % 10;
            x /= 10;
        }
        return res;
    }
}