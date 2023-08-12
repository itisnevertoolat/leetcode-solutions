class Solution {
    public boolean checkString(String s) {
        if(!s.contains("a") || !s.contains("b"))
            return true;
        int first = s.indexOf('b');
        int last = s.lastIndexOf('a');
        if(first < last)
            return false;
        else
            return true;
        
    }
}