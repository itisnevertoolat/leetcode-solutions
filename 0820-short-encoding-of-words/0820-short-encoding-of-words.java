class Trie {
    TrieNode root;
    class TrieNode {
        Map<Character, TrieNode> children = new HashMap<>();
    }
    public Trie(){
        root =  new TrieNode();
    }

    public void insert(String s){
        TrieNode currentNode = root;
        for(int i=s.length()-1;i>=0;i--){
            char c = s.charAt(i);
            if(!currentNode.children.containsKey(c))
                currentNode.children.put(c, new TrieNode());
            currentNode = currentNode.children.get(c);

        }

    }
    public int search(String s){
        TrieNode currentNode = root;
        for(int i=s.length()-1;i>=0;i--){
            char c = s.charAt(i);
            if(!currentNode.children.containsKey(c))
                return s.length();
            currentNode = currentNode.children.get(c);
        }
        return 0;

    }

}

class Solution {
    public int minimumLengthEncoding(String[] words) {
        int res = 0;
        Trie root = new Trie();
        Arrays.sort(words, (a,b)->Integer.compare(a.length(), b.length()));
        for(int i=words.length-1;i>=0;i--){
            String s = words[i];
            int len = root.search(s);
            if( len != 0){
                
                res += len;
                res++;
                root.insert(s);
            }
        }
        return res;
    }
}