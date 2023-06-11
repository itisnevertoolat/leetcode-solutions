class Solution {
    public int maximum69Number (int num) {
        char[] s = String.valueOf(num).toCharArray();
        int indx = 0;
        StringBuilder sb= new StringBuilder();
        for(char c: s){
            if(c == '6'){
                sb.append('9');
                break;
            }
            indx++;
            sb.append(c);
        }
        if(indx < s.length) sb.append(new String(s).substring(indx+1));
        int res = Integer.parseInt(sb.toString());
        return res;
        
        
    }
}