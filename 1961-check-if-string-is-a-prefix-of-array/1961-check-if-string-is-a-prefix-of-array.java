class Solution {
    public boolean isPrefixString(String s, String[] words) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        while(sb.length() < s.length() && count < words.length)
            sb.append(words[count++]);
        if(sb.length() != s.length())
            return false;
        int start = 0;
        int end = s.length() - 1;
        while(start <= end){
            if(s.charAt(start) != sb.charAt(start) || s.charAt(end) != sb.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }
}