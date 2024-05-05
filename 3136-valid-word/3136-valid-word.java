class Solution {
    public boolean isValid(String word) {
        if(word.length() < 3)
            return false;
        if(!word.contains("a") && !word.contains("e") && !word.contains("i") && !word.contains("o") && !word.contains("u")
          && !word.contains("A") && !word.contains("E") && !word.contains("I") && !word.contains("O") && !word.contains("U"))
            return false;
        if(word.contains("@") || word.contains("$") || word.contains("#"))
            return false;
        Set<Character> vowles = new HashSet<>();
        vowles.add('a');
        vowles.add('e');
        vowles.add('i');
        vowles.add('o');
        vowles.add('u');
        vowles.add('A');
        vowles.add('E');
        vowles.add('I');
        vowles.add('O');
        vowles.add('U');


        List<Character> chars = new ArrayList<>();
        for(int i=65;i<= 90;i++)
            chars.add((char)i);
        for(int i=97;i<= 122;i++)
            chars.add((char)i);
        for(char c: word.toCharArray()){
            if(chars.contains(c) && ! vowles.contains(c))
                return true;
        }
        return false;
    }
}