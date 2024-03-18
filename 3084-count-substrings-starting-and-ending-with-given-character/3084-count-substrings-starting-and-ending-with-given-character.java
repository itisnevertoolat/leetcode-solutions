class Solution {
    public long countSubstrings(String s, char c) {
        long count = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == c)
                count++;
        }
        long res = count;
        while(res > 0)
            count += --res;
        return count;
    }
}