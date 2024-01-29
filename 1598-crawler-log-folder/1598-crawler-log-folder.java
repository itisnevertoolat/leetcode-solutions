class Solution {
    public int minOperations(String[] logs) {
        Stack<Integer> stack = new Stack<>();
        for(String s: logs){
            if(s.equals("./"))
                continue;
            else if(s.equals("../")){
                if(stack.size() == 0)
                    continue;
                else
                    stack.pop();
            }
            else
                stack.push(1);
        }
        return stack.size();
    }
}