class Solution {
    public String reversePrefix(String word, char ch) {
        if(word.length() == 1 || !word.contains(ch+"") || word.charAt(0) == ch) return word;
        char[] arr = word.toCharArray();
        int index = word.indexOf(ch);
        int start = 0;
        int end = index;
        while(start <= end){
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            end--;
            start++;
        }
        
            return new String(arr);
        
    }
}