class Solution {
    public int countPrefixes(String[] words, String s) {
        int count = 0;
        char[] arr = s.toCharArray();
        for(String st: words){
            if(st.length() > s.length()) continue;
            else
                count = st.equals(s.substring(0, st.length())) ? count+1: count;
        }
            
    return count;
    }
    
}