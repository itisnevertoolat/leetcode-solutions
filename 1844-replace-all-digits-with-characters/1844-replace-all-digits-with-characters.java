class Solution {
    public String replaceDigits(String s) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for(i=1;i<s.length();i +=2){
            sb.append(s.charAt(i-1));
            sb.append((char)(s.charAt(i-1)+s.charAt(i) - '0'));
            
        }
        sb.append(s.substring(i-1));
        return sb.toString();
    }
}

    // public String replaceDigits(String s) {
    //     char[] res = s.toCharArray();
    //     for (int i = 1; i < s.length(); i += 2) {
    //         res[i] = (char)(res[i - 1] + res[i] - '0');
    //     }
    //     return String.valueOf(res);
    // }