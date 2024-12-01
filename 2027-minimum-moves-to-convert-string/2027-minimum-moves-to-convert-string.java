class Solution {
    public int minimumMoves(String s) {
        int res = 0, count = 0, start = 0;
        for(char c: s.toCharArray()){
            if(start >= 1)
                start++;
                
            if(start == 3){
                res++;
                start = 0;
            }
            else if(c == 'X')
                start = start == 0 ? 1 : start;

        }
        if(start != 0)
            res++;
        return res;
    }
}