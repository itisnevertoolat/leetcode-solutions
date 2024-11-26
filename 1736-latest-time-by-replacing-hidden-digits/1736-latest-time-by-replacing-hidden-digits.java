class Solution {
    public String maximumTime(String time) {
        StringBuilder sb = new StringBuilder(time);
        
        if(sb.equals("??:??"))
            return "23:59";
        
        if(sb.charAt(0) == '?'){
            if(sb.charAt(1) == '?'){
                sb.setCharAt(0, '2');
                sb.setCharAt(1, '3');
            }

            else{
                if(sb.charAt(1)  <= '3')
                    sb.setCharAt(0, '2');
                else
                    sb.setCharAt(0, '1');
            }
        }
        if(sb.charAt(1) == '?'){

            if(sb.charAt(0)  == '2')
                sb.setCharAt(1, '3');
            else
                sb.setCharAt(1, '9');
        }
        if(sb.charAt(3) == '?')
            sb.setCharAt(3, '5');
        if(sb.charAt(4) == '?')
            sb.setCharAt(4, '9');

        return sb.toString();


    }
}