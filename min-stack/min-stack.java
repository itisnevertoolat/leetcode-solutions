class MinStack {
        Stack<Integer> mainStack = new Stack<>();
        Stack<Integer> miniStack = new Stack<>();

    public MinStack() {
        
        
    }
    
    public void push(int val) {
        mainStack.push(val);
        if(miniStack.isEmpty() || val <= miniStack.peek()){
            miniStack.push(val);
        }
       
    }
    
    public void pop() {
        int x = mainStack.pop();
        if(miniStack.size()!=0 &&  x ==   miniStack.peek()){
            miniStack.pop();
        }
        
    }
    
    public int top() {
        return mainStack.peek();
        
    }
    
    public int getMin() {
        return miniStack.peek();
        
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */