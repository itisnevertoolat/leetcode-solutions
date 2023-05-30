class Solution {
    public boolean checkIfPangram(String sentence) {
        if(sentence.length() < 26) return false;
        Map<Character, Integer> res = new HashMap<>();
        char[] arr = sentence.toCharArray();
        for(int i=97;i<123;i++){
            res.put((char)i, 0);
        }
        for(char c: arr){
            res.put(c, res.get(c)+1);
        }
        
        for(int i=97;i<123;i++){
            if(res.get((char)i) == 0) return false;
        }
        return true;
    }
}