class Solution {
    public List<Boolean> camelMatch(String[] queries, String pattern) {
        char[] patChars = pattern.toCharArray();
        List<Boolean> res = new ArrayList<>();
        for(String query: queries){
            res.add(isMatch(query.toCharArray(), patChars));
                
        }
        return res;
        
    }
    
    public boolean isMatch(char[] query, char[] patChars){
        int j = 0;
        for(int i=0;i<query.length;i++){
            if(j<patChars.length && patChars[j] == query[i])
                j++;
            else if(query[i] >= 'A' && query[i]<= 'Z')
                return false;
        }
        return j == patChars.length;
    }
}