class Solution {
    public int minTimeToType(String s) {
        char first = 'a';
        int sum = s.length();
        for(int i=0;i<s.length();i++){
            char second = s.charAt(i);
            int diff = Math.abs(first - second);
            sum += Math.min(26-diff,diff);
            first = second;
        }
        return sum;
    }
}