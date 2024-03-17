class Solution {
    public boolean isSubstringPresent(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            sb.append(s.charAt(i));
        }
        for(int i=0;i<s.length()-1;i++){
            if(sb.toString().contains(s.substring(i, i+2)))
                return true;
        }
        return false;
    }
}