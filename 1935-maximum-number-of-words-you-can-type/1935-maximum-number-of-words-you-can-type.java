class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        char[] arr = brokenLetters.toCharArray();
        String[] words = text.split(" ");
        int count = 0;
        for(String s: words){
            boolean flag = true;
            for(char c: arr){
                if(s.contains(c+"")){
                    flag = false;
                    break;
                }
            }
            if(flag)
                count++;
        }
        return count;
    }
}