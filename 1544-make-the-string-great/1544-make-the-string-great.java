class Solution {
    public String makeGood(String s) {
        if(s.length() ==1)
            return s;
        Stack<Character> stack = new Stack<>();

        for(char c: s.toCharArray()){
            if(stack.isEmpty())
                stack.push(c);
            else{
                char x = stack.peek();
                if((x + 32) == c || (x - 32) == c)
                    stack.pop();
                else
                    stack.push(c);
            }

        }
        StringBuilder sb = new StringBuilder();
        for(char c: stack)
            sb.append(c);
        return sb.toString();
        
    }
}