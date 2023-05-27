class Solution {
    public String makeSmallestPalindrome(String s) {
        int left = 0;
        int right = s.length()-1;
        StringBuilder res = new StringBuilder(s);
        while(left < right){
            if(s.charAt(left) > s.charAt(right)){
                res.setCharAt(left, s.charAt(right));
            }else if(s.charAt(left) < s.charAt(right))  res.setCharAt(right, s.charAt(left));
            left++;
            right--;
            
        }
        return res.toString();
    }
}