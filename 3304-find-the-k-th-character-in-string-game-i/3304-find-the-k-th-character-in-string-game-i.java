class Solution {
    public char kthCharacter(int k) {
        StringBuilder sb= new StringBuilder("a");
        while(sb.length() < k){
            int len = sb.length();
            for(int i=0;i<len;i++){
                char c = sb.charAt(i) == 122 ? 'a' : (char) (sb.charAt(i) + 1);
                sb.append(c);
                
            }
        }
        return sb.charAt(k-1);
        
    }
}