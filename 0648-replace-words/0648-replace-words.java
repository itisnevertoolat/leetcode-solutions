class Trie {
    TrieNode root;
    class TrieNode {
        Map<Character, TrieNode> children = new HashMap<>();
        boolean isWordEnded = false;
    }
    public Trie(){
        root =  new TrieNode();
    }

    public void insert(char[] arr){
        TrieNode currentNode = root;
        for(char c: arr){
            if(!currentNode.children.containsKey(c))
                currentNode.children.put(c, new TrieNode());
            currentNode = currentNode.children.get(c);

        }
        currentNode.isWordEnded = true;

    }
    public String search(char[] arr){
        TrieNode currentNode = root;
        StringBuilder sb = new StringBuilder();
        for(char c: arr){
            
            if(!currentNode.children.containsKey(c))
                return "";
            currentNode = currentNode.children.get(c);
            sb.append(c);
            if(currentNode.isWordEnded){
                return sb.toString();
            }
            
        }
        return sb.toString();

    }

}

class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        Trie root = new Trie();
        String[] words = sentence.split(" ");
        StringBuilder res = new StringBuilder();
        for(String word : dictionary){
            root.insert(word.toCharArray());
        }
        for(String word : words){
            String temp = root.search(word.toCharArray());
            if(!temp.equals(""))
                res.append(temp);
            else
                res.append(word);
            res.append(" ");
        }
        
        return res.toString().trim();
     }
}



// class Solution {
//     public String replaceWords(List<String> dictionary, String sentence) {
//         String[] words = sentence.split(" ");
//         Map<Integer, String> map = new HashMap<>();
//         for(String word : dictionary){
//             for(int i=0;i<words.length;i++){
//                 if(words[i].startsWith(word)){
//                     if(words[i].length() > word.length())
//                         words[i] =word;
                    
//                 }
//             }
            
//         }
//         StringBuilder sb = new StringBuilder();
//         for(String s: words)
//             sb.append(s+" ");
//         return sb.toString().trim();
        
//     }
// }