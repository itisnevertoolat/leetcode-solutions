class Solution {
    public String getSmallestString(String s) {
        StringBuilder sb = new StringBuilder(s);
        for(int i=0;i<sb.length()-1;i++){
            char prev = sb.charAt(i);
            char next = sb.charAt(i+1);
            if(prev > next && (prev % 2 == next % 2)){
                sb.setCharAt(i, next);
                sb.setCharAt(i+1, prev);
                return sb.toString();

            }
        }
        return sb.toString();
    }
}