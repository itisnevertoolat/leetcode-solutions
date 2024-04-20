class Solution {
    public int getLucky(String s, int k) {
        int sum = 0;
        StringBuilder sb = new StringBuilder();
        
        for(char c: s.toCharArray()){
            sum += sumNum((c - 97) + 1);
        }
        k--;
        while(k-- >= 1)
            sum = sumNum(sum);
        return sum;
        
    }
    public int sumNum(int x){
        int res = 0;
        while(x > 0){
            res += x % 10;
            x /= 10;
        }
        return res;
    }
}