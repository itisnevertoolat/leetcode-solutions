class Solution {
    public int minimumChairs(String s) {
        int max = 0, count = 0;
        for(char c: s.toCharArray()){
            if(c == 'E')
                count++;
            else{
                max = Math.max(max, count);
                count--;
            }
        }
        return Math.max(max, count);
    }
}