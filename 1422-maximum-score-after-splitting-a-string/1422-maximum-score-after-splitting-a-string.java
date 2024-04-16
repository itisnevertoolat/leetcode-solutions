class Solution {
    public int maxScore(String s) {
        int ones = 0, zeros = 0;
        
        for(int i=1;i<s.length();i++)
            if(s.charAt(i) == '1')
                ones++;
        int res = ones;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i) == '1' && i != 0)
                ones--;
            else if(s.charAt(i) == '0')
                zeros++;
            res = Math.max(res, zeros+ones);
        }
        return res;
        
    }
}