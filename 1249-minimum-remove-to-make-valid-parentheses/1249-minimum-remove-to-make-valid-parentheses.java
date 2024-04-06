class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Character> leftCur = new Stack<>();
        Stack<Character> rightCur = new Stack<>();
        for(char c: s.toCharArray()){
            if(c == '(')
                leftCur.push('(');
            if(c == ')' && rightCur.size() < leftCur.size())
                rightCur.push(')');
        }
        while(rightCur.size() < leftCur.size())
            leftCur.pop();
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for(char c: s.toCharArray()){
            if(c == '(' && leftCur.size() > 0){
                sb.append(leftCur.pop());
                count++;
            }
                
            else if(c == ')' && count > 0){
                sb.append(rightCur.pop());
                count--;
            }
                
            else if(c != '('  && c != ')')
                sb.append(c);
        }
        return sb.toString();
        
    }
}