class Solution {
    public String firstPalindrome(String[] words) {
        for(String s: words){
            if(getPalin(s)) return s;
        }
        return "";
        
    }
    public boolean getPalin(String s){
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i) != s.charAt((s.length()-i) - 1)) return false;
        }
        return true;
    }
}