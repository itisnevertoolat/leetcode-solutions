class Solution {
    public boolean isCircularSentence(String sentence) {
        String[] words = sentence.split(" ");
        int len = words.length;
        if(words[0].charAt(0) != words[len -1].charAt(words[len - 1].length() - 1))
            return false;
        for(int i=0;i<words.length-1;i++)
            if(words[i].charAt(words[i].length() - 1) != words[i+1].charAt(0))
                return false;
        return true;
        
    }
}