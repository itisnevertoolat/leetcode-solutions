class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int size = temperatures.length;
        Stack<Integer> stack = new Stack<>();
        int[] res = new int[size];
        for(int i=0;i<size;i++){
            while(!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]){
                res[stack.peek()] = i - stack.pop();
            }
            stack.push(i);
        }
        return res;
        
    }
}