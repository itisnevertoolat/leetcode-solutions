class Solution {
    public int minAddToMakeValid(String s) {
       Stack<Character> stack = new Stack<>();
        for(char c: s.toCharArray()){
            if(stack.size() == 0)
                stack.push(c);
            else{
                char x = stack.peek();
                if(x == '(' && c == ')')
                    stack.pop();
                else
                    stack.push(c);
            }
        }
        return stack.size();
    }
}