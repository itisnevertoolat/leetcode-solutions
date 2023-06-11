class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String> res = new HashSet<>();
        for(String str: words){
            StringBuilder s = new StringBuilder();
            for(int i=0;i<str.length();i++){
                s.append(morse[str.charAt(i)-'a']);
            }
            res.add(s.toString());
            
        }
        return res.size();
    }
}