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
        char[] arr = new char[end+1];
        while(start <= end){
            arr[start] = word.charAt(end);
            arr[end] = word.charAt(start);
            end--;
            start++;
        }
        res.append(new String(arr));
        res.append(word.substring(arr.length));
        
            return res.toString();
        
    }
}