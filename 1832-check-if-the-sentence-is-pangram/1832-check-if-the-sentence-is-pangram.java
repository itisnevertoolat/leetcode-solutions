class Solution {
    public boolean checkIfPangram(String sentence) {
        if(sentence.length() < 26) return false;
        Set<Character> set = new HashSet<>();
        char[] arr = sentence.toCharArray();
        for(char c: arr){
            set.add(c);
        }
        if(set.size() != 26 ) return false;

        return true;
    }
}