class Solution {
    public boolean areNumbersAscending(String s) {
        List<String> list = new ArrayList<>();
        String prev = "0";
        for(String word: s.split(" ")){
            
            if(word.startsWith("1") || word.startsWith("2") || word.startsWith("3")
              ||word.startsWith("4") || word.startsWith("5") || word.startsWith("6")
              ||word.startsWith("7") || word.startsWith("8") || word.startsWith("9")){
                if(Integer.valueOf(word) <= Integer.valueOf(prev))
                    return false;
                prev = word;
            }

        }
        return true;
    }
}