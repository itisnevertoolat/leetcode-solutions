class Solution {
    public void reverseString(char[] s) {
        int x = 0;
        int y = s.length - 1;
        char t;
        while(x < y){
            t = s[x];
            s[x] = s[y];
            s[y] = t;
            x++;
            y--;
        }
    }
}