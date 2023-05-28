class Solution {
    public String removeDuplicates(String s) {
        if(s.length() == 1) return s;
        Stack<Character> chars = new Stack<>();
        StringBuilder res = new StringBuilder();
        for(Character i: s.toCharArray()){
            if(chars.size() > 0){
                if(chars.peek().equals(i)){
                    chars.pop();
                } 
                    
                else {
                    chars.push(i);
                }
            }else chars.push(i);


        }
        for(Character i: chars) res.append(i);
        return new String(res);
    }
}