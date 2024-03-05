class Solution {
    public int minimumLength(String s) {
        int size = s.length() - 1;
        int start = 0;
        int end = size;
        while(start < end){
            if(s.charAt(start) == s.charAt(end)){
                char c = s.charAt(end);
                while(start <= end && s.charAt(start) == c)
                    start++;
                while(start <= end && s.charAt(end) == c)
                    end--;
            }
            else
                break;
        }
        return (end - start) + 1;
    }
}