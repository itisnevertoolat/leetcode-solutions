class Solution {
    public String minRemoveToMakeValid(String s) {
      StringBuilder sb = new StringBuilder(s);
      Stack<Integer> st = new Stack<>();
      for (int i = 0; i < sb.length(); ++i) {
        if (sb.charAt(i) == '(') st.add(i);
        if (sb.charAt(i) == ')') {
          if (!st.empty()) 
              st.pop();
          else 
              sb.setCharAt(i, '*');
        }
      }
      while (!st.empty())
        sb.setCharAt(st.pop(), '*');
      return sb.toString().replaceAll("\\*", "");
    }
    
//     public String minRemoveToMakeValid(String s) {
//         Stack<Character> leftCur = new Stack<>();
//         Stack<Character> rightCur = new Stack<>();
//         for(char c: s.toCharArray()){
//             if(c == '(')
//                 leftCur.push('(');
//             if(c == ')' && rightCur.size() < leftCur.size())
//                 rightCur.push(')');
//         }
//         while(rightCur.size() < leftCur.size())
//             leftCur.pop();
//         StringBuilder sb = new StringBuilder();
//         int count = 0;
//         for(char c: s.toCharArray()){
//             if(c == '(' && leftCur.size() > 0){
//                 sb.append(leftCur.pop());
//                 count++;
//             }
                
//             else if(c == ')' && count > 0){
//                 sb.append(rightCur.pop());
//                 count--;
//             }
                
//             else if(c != '('  && c != ')')
//                 sb.append(c);
//         }
//         return sb.toString();
        
//     }
}