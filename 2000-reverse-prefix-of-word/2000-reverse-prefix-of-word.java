class Solution {
    public String reversePrefix(String word, char ch) {
        if(word.length() == 1 || !word.contains(ch+"") || word.charAt(0) == ch) return word;
        int start = 0;
        int end = 0;
        
        StringBuilder res = new StringBuilder();
        for(int i=0;i<word.length();i++){
            if(word.charAt(i) == ch){
                end = i;
                break;
            }
        }
        int index = end+1;
        res.setLength(index);
        
        while(start <= end){
            res.setCharAt(start, word.charAt(end));
            res.setCharAt(end, word.charAt(start));
            end--;
            start++;
        }
        res.append(word.substring(index));
        
            return res.toString();
        
    }
}