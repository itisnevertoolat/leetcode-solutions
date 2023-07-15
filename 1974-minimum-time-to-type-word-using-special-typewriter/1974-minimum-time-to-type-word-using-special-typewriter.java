class Solution {
    public int minTimeToType(String s) {
        char first = 'a';
        int sum = s.length();
        for(int i=0;i<s.length();i++){
            char second = s.charAt(i);
            sum += Math.min(26-Math.abs(first-second),Math.abs(first-second));
            first = second;
        }
        return sum;
    }
}