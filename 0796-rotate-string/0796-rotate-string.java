class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length())
            return false;
        for(int i=0;i<s.length();i++){
            String sub = s.substring(i+1) + s.substring(0, i+1);
            if(sub.equals(goal))
                return true;
        }
        return false;
    }
}