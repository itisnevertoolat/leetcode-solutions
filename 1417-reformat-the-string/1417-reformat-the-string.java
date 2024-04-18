class Solution {
    public String reformat(String s) {
        List<Character> letters = new ArrayList<>();
        List<Character> numbers = new ArrayList<>();
        for(char c : s.toCharArray()){
            if(c - '0' > 10)
                letters.add(c);
            else
                numbers.add(c);
        }
        
        if(Math.abs(letters.size() - numbers.size())>= 2)
            return "";
        StringBuilder sb = new StringBuilder();
        if(letters.size() > numbers.size()){
            for(int i=0;i<numbers.size();i++){
                sb.append(letters.get(i));
                sb.append(numbers.get(i));
                
            }
            sb.append(letters.get(letters.size()-1));
        }
        else if(letters.size() < numbers.size()){
            for(int i=0;i<letters.size();i++){
                sb.append(numbers.get(i));
                sb.append(letters.get(i));
                
            }
            sb.append(numbers.get(numbers.size() - 1));
        }else{
            for(int i=0;i<letters.size();i++){
                sb.append(numbers.get(i));
                sb.append(letters.get(i));
                
            }
        }
        return sb.toString();
        
    }
}