class Solution {
    StringBuilder sb= new StringBuilder("a");
    int count = 0;
    public char kthCharacter(int k) {
        
        while(sb.length() < k){
            count = 0;
            recu(sb.length());
        }
        return sb.charAt(k-1);
        
    }
    public char recu(int n) {
        if(n == 0)
            return '-';
        char c = sb.charAt(count) == 122 ? 'a' : (char) (sb.charAt(count) + 1);
        count++;
        sb.append(c);

        return recu(n-1);

    }
}