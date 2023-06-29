class Solution {
    public int prefixCount(String[] words, String pref) {
        int res = 0;
        for(String s: words){
            if(s.length() < pref.length()) continue;
            if(s.substring(0, pref.length()).equals(pref)) res++;
        }
        return res;
    }
}