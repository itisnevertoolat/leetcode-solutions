class Solution {
    public String replaceDigits(String s) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for(i=1;i<s.length();i +=2){
            sb.append(s.charAt(i-1));
            sb.append((char)(s.charAt(i-1)+Character.getNumericValue(s.charAt(i))));
            
        }
        sb.append(s.substring(i-1));
        return sb.toString();
    }
}