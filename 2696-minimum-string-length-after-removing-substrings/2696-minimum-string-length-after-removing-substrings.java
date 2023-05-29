class Solution {
    public int minLength(String s) {
        Stack<Character> res = new Stack<>();
        res.push(s.charAt(0));
        for(char t: s.substring(1).toCharArray()){
            
            if(!res.isEmpty() && ((res.peek() == 'A' && t == 'B') || (res.peek() == 'C' && t == 'D'))) res.pop();
            else res.push(t);
        }
        return res.size();
    }
}