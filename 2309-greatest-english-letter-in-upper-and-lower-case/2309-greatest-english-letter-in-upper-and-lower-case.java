class Solution {
    public String greatestLetter(String s) {
        String res = "";
        int max = Integer.MIN_VALUE;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i) >= 65 ? (char)(s.charAt(i) + 32) : (char)(s.charAt(i) - 32);
            if(s.contains(c+"") && c > max){
                max = c;
                res = c + "";
            }
                
        }
        return res.toUpperCase();
    }
}