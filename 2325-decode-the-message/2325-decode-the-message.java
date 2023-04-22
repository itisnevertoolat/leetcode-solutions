class Solution {
    public String decodeMessage(String key, String message) {
        Map<Character, Character> letters = new HashMap<>();
        StringBuilder res = new StringBuilder();
        key = key.replaceAll("\\s", "");
        char firstAlpha = 'a';
        for(int i=0;i<key.length();i++){
            if (!letters.containsKey(key.charAt(i))){
                letters.put(key.charAt(i),firstAlpha++);
            }

        }


        for(int i=0;i<message.length();i++){
            if(message.charAt(i) == ' '){
                res.append(' ');
            }else{
                res.append(letters.get(message.charAt(i)));
            }
            
        }
        return res.toString();
        
    }
}