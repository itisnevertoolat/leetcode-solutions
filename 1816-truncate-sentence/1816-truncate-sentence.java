class Solution {
    public String truncateSentence(String s, int k) {
        int track=0;
        int i =0;
        for(char c: s.toCharArray()){
            if(c == ' ') track++;
            if(track==k) return s.substring(0,i);
            i++;
        }
        return s;
    }
}