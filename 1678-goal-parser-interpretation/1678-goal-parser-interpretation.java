// class Solution {
//     public String interpret(String command) {
//         StringBuilder res = new StringBuilder();
//         for(int i=0;i<command.length();i++){
//             if(command.charAt(i) == ')' && command.charAt(i-1) == '(') res.append("o");
//             else if(command.charAt(i) == ')' && command.charAt(i-1) == 'l') res.append("al");
//             else if(command.charAt(i) == 'G') res.append("G");
            
//         }
//         return res.toString();
//     }
// }


class Solution {
    public String interpret(String command) {
        return command.replace("()", "o").replace("(al)", "al");
    }
}