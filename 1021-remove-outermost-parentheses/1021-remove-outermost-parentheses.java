class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> paren = new Stack<>();
        StringBuilder res = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '('){
                if(paren.size() > 0){
                    res.append(s.charAt(i));
                }
                paren.push('(');
            }else{
                paren.pop();
                if(paren.size() > 0){
                    res.append(')');
                }
            }
        }
        return res.toString();
    }
}