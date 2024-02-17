class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] arr = sentence.split(" ");
        int start = 0, end = arr.length-1, res = -1;
        
        while(start <= end){
            if(arr[start++].startsWith(searchWord))
                return start;
            else if(arr[end--].startsWith(searchWord))
                res = end + 2;
            
        }
        return res;
    }
}