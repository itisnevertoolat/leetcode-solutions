class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> res = new Stack<>();
        int sum = 0;
        for(String s: operations){
            if(s.equals("C")) res.pop();
            else if(s.equals("D")) res.push(res.peek()*2);
            else if(s.equals("+")){
                int s2 = res.pop();
                int s1 = res.peek();
                res.push(s2);
                res.push(s1+s2);
                }
            else res.push(Integer.valueOf(s));
        }
        for(int i: res) sum += i;
        return sum;
    }
}