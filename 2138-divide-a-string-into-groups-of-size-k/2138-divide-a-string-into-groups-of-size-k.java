class Solution {
    public String[] divideString(String s, int k, char fill) {
        int rem = s.length() % k != 0 ? 1:0;
        int len = s.length() / k;
        String[] res = new String[len + rem];
        int i=0, count = 0;
        while(len-- > 0){
            res[count++] = s.substring(i, i+k);
            i +=k;
        }
        while(rem-- > 0){
            res[count++] = 
                s.substring(i, s.length()) + (fill+"").repeat(k - (s.length() - i));
        }
        
        return res;
        
    }
}