class Solution {
    public int countAsterisks(String s) {
        if(!s.contains("*")) return 0;
        int res = 0;
        int verticalBar = 0;
        for(char c : s.toCharArray()){
            if(c == '|') verticalBar++;
            if(c == '*' && verticalBar % 2 == 0) res++;
        }
        return res;
        
    }
}