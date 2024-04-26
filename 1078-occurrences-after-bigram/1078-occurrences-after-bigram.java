class Solution {
    public String[] findOcurrences(String text, String first, String second) {
        List<String> res = new ArrayList<>();
        String[] words = text.split(" ");
        for(int i=1;i<words.length-1;i++){
            if(words[i-1].equals(first) && words[i].equals(second))
                res.add(words[i+1]);
        }
        String[] wordsRes = new String[res.size()];
        int count = 0;
        for(String s: res){
            wordsRes[count++] = s;
        }
        return wordsRes;
    }
}