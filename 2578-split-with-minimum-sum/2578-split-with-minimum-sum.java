class Solution {
    public int splitNum(int num) {
        String nums = String.valueOf(num);
        char[] chars = nums.toCharArray();
        Arrays.sort(chars);
        nums =  new String(chars);
        StringBuilder num1 = new StringBuilder();
        StringBuilder num2 = new StringBuilder();
        for(int i=0;i<nums.length();i +=2){
            char c = nums.charAt(i);
            
            num1.append(c);
            if((i+1) < nums.length()){
                char c2 = nums.charAt(i+1);
                num2.append(c2);
            }
            
        }
        return Integer.parseInt(num1.toString()) + Integer.parseInt(num2.toString());
        
    }
}