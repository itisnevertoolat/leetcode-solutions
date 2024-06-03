class Solution {
    
    public int appendCharacters(String s, String t) {
        int j = 0;
        int i=0;
        for(;i<t.length();i++){
            for(;j<s.length();j++){
                if(s.charAt(j) == t.charAt(i)){
                    j++;
                    break;
                    
                }
                    
            }
            if(j==s.length()){
                break;
            }
        }
        if(i< t.length() && s.charAt(j-1) == t.charAt(i))
            i++;
        
        return t.length() - i;
        
    }
}