class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count = words.length;
        for(String s: words){
            for(int i=0;i<s.length();i++){
                if(!allowed.contains(s.charAt(i)+"")){
                    count--;
                    break;
                }
            }
        }
        return count;
        
    }
}