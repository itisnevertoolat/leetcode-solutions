class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        String[] words = sentence.split(" ");
        Map<Integer, String> map = new HashMap<>();
        for(String word : dictionary){
            for(int i=0;i<words.length;i++){
                if(words[i].startsWith(word)){
                    if(words[i].length() > word.length())
                        words[i] =word;
                    
                }
            }
            
        }
        StringBuilder sb = new StringBuilder();
        for(String s: words)
            sb.append(s+" ");
        return sb.toString().trim();
        
    }
}