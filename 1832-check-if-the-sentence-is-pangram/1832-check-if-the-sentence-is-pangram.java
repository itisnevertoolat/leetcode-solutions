class Solution {
    public boolean checkIfPangram(String sentence) {
        if(sentence.length() < 26) return false;
        Set<Character> set = new HashSet<>();
        char[] arr = sentence.toCharArray();
        for(char c: arr){
            set.add(c);
        }
        for(int i=97;i<123;i++){
            if(!set.contains((char)i)) return false;
        }

        return true;
    }
}