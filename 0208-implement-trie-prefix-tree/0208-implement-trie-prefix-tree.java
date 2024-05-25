class Trie {

    TrieNode root = new TrieNode();
    
    public Trie() {
        
    }
    
    public void insert(String word) {
        TrieNode current = root;
        for(char ch : word.toCharArray()){
            if(!current.children.containsKey(ch)){
                current.children.put(ch, new TrieNode());
            }
            current = current.children.get(ch);
        }
        current.children.put('*', null);
    }

    public boolean search(String word) {
        TrieNode current = root;
        for(char ch : word.toCharArray()){
            if(!current.children.containsKey(ch)){
                return false;
            }
            current = current.children.get(ch);
        }
        return current.children.containsKey('*');
    }
    
    public boolean startsWith(String prefix) {
        TrieNode current = root;
        for(char ch : prefix.toCharArray()){
            if(!current.children.containsKey(ch)){
                return false;
            }
            current = current.children.get(ch);
        }
        return true;
    }
    
    static class TrieNode{
        Map<Character, TrieNode> children = new HashMap<>();
    }
}