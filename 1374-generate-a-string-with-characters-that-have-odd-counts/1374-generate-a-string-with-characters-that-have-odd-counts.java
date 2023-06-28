class Solution {
    public String generateTheString(int n) {
        StringBuilder sb = new StringBuilder();
        if(n % 2 !=0) sb.append("a".repeat(n));
        else if(n % 2 ==0){
            sb.append("a".repeat(n-1));
            sb.append("b");
        }

        
        return sb.toString();
        
    }
}