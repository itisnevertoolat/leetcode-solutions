class Solution {
    public int countDigits(int num) {
        int x = num;
        int res = 0;
        while(num > 0){
            if((x % (num % 10)) == 0) res++;
            num /= 10;
        }
        return res;
        
    }
}