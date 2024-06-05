//Trie Approach
class Trie{
    TrieNode root;
    List<Character> capitalLetters;
    class TrieNode{
        Map<Character, TrieNode> children =  new HashMap<>();
    }
    
    public Trie(){
        root = new TrieNode();
        capitalLetters = new ArrayList<>();
    }
    public void insert(String s){
        TrieNode curr = root;
        for(Character c: s.toCharArray()){
                capitalLetters.add(c);
            if(!curr.children.containsKey(c))
                curr.children.put(c, new TrieNode());

            curr = curr.children.get(c);
        }
    }
    public boolean search(String s){
        TrieNode curr = root;
        List<Character> chars = new ArrayList<>(capitalLetters);
        int count = 0;
        for(Character c: s.toCharArray()){
            if(!curr.children.containsKey(c)){
                if(c >= 'A' && c <= 'Z')
                    return false;
                else
                    continue;
                
            }
            chars.remove(count);
            curr = curr.children.get(c);
            
        }
        return chars.isEmpty();
    }
}
class Solution {
    public List<Boolean> camelMatch(String[] queries, String pattern) {
        Trie root = new Trie();
        root.insert(pattern);
        List<Boolean> res = new ArrayList<>();
        for(String query: queries){
            res.add(root.search(query));
                
        }
        return res;
        
    }
}



// Two Pointers approach
// class Solution {
//     public List<Boolean> camelMatch(String[] queries, String pattern) {
//         char[] patChars = pattern.toCharArray();
//         List<Boolean> res = new ArrayList<>();
//         for(String query: queries){
//             res.add(isMatch(query.toCharArray(), patChars));
                
//         }
//         return res;
        
//     }
    
//     public boolean isMatch(char[] query, char[] patChars){
//         int j = 0;
//         for(int i=0;i<query.length;i++){
//             if(j<patChars.length && patChars[j] == query[i])
//                 j++;
//             else if(query[i] >= 'A' && query[i]<= 'Z')
//                 return false;
//         }
//         return j == patChars.length;
//     }
// }