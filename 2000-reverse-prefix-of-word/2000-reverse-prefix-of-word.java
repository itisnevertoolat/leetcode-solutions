class Solution {
    public String reversePrefix(String word, char ch) {
        if(word.length() == 1 || !word.contains(ch+"") || word.charAt(0) == ch) return word;
        char[] arr = word.toCharArray();
        int end = 0;
        for(; end < arr.length ; end++)
            if(word.charAt(end)==ch)
                break;
        int start = 0;
        while(start <= end){
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            end--;
            start++;
        }
        
            return String.valueOf(arr);
        
    }
}