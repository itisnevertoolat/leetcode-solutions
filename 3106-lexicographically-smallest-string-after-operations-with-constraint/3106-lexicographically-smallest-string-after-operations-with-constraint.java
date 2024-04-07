class Solution {
    public String getSmallestString(String s, int k) {
        if(k==0)
            return s;
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            for (char d = 'a'; d <= 'z'; d++) {
                if (Math.min(Math.abs(c - d), 26 - Math.abs(c - d)) <= k) {
                    k -= Math.min(Math.abs(c - d), 26 - Math.abs(c - d));
                    sb.append(d);
                    break;
                }
        
            }
        }
        return sb.toString();
    }
}
