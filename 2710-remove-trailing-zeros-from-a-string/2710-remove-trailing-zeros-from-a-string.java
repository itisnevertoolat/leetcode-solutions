class Solution {
    public String removeTrailingZeros(String num) {
        StringBuilder s = new StringBuilder();
        for(int i=num.length()-1;i>=0;i--){
            if(s.length() == 0 && num.charAt(i) == '0') continue;
            else s.append(num.charAt(i));
        }
        s.reverse();
        return s.toString();
    }
}