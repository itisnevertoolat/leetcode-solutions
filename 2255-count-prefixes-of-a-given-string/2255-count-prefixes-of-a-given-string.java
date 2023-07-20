class Solution {
    public int countPrefixes(String[] words, String s) {
        int count = 0;
        for(String st: words)
            count = s.startsWith(st) ? count + 1 : count;
    return count;
    }
    
}