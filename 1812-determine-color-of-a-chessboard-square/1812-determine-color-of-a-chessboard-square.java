class Solution {
    public boolean squareIsWhite(String coordinates) {
        int n = (coordinates.charAt(0) - '0') + (coordinates.charAt(1) - '0');
        if(n % 2 ==0) return false;
        else return true;
        
    }
}