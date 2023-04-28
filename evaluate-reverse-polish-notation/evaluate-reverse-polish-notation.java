class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        int a;
        int b;
        for(String i: tokens){
            if(i.equals("+")){
                b = stack.pop();
                a = stack.pop();
                stack.push(a + b);
            }
             else if(i.equals("-")){
                b = stack.pop();
                a = stack.pop();
                stack.push(a - b);
            }
            else if(i.equals("*")){
                b = stack.pop();
                a = stack.pop();
                stack.push(a * b);
            }
            else if(i.equals("/")){
                b = stack.pop();
                a = stack.pop();
                stack.push(a / b);
            }else {
                stack.push(Integer.parseInt(i));
            }

            }
        return stack.pop();
        
    }
}