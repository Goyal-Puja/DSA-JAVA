package trie;

class TrieNode {
    TrieNode[] children;
    boolean isEndOfWord;

    public TrieNode(){
        children = new TrieNode[26];            // An array of TrieNode references. Each index corresponds to a character ('a' to 'z').
                                               // If the character exists in the word, the corresponding index will contain a reference to
                                              // the child TrieNode representing that character.
        isEndOfWord = false;
    }
}

public class Trie {
    private TrieNode root;
    public Trie(){
        root = new TrieNode();
    }
    public void insert(String word){
        TrieNode current = root;
        for(int i=0;i<word.length();i++){
            char ch = word.charAt(i);
            int index = ch - 'a';
            if(current.children[index] == null){
                current.children[index] = new TrieNode();
            }
            current = current.children[index];
        }
        current.isEndOfWord = true;
    }
    public boolean search(String word){
        TrieNode current = root;
        for(int i=0;i<word.length();i++){
            char ch = word.charAt(i);
            int index = ch - 'a';
            if(current.children[index] == null){
                return false;
            }
            current = current.children[index];
        }
        return current != null && current.isEndOfWord;
    }
    public boolean startsWith(String prefix){
        TrieNode current = root;
        for(int i=0;i<prefix.length();i++){
            char ch = prefix.charAt(i);
            int index = ch - 'a';
            if(current.children[index] == null){
                return false;
            }
            current = current.children[index];
        }
        return true;
    }

    public static void main(String[] args){
        Trie trie = new Trie();
        trie.insert("apple");
        System.out.println(trie.search("apple"));
        System.out.println(trie.search("app"));
        System.out.println(trie.startsWith("app"));
        trie.insert("app");
        System.out.println(trie.search("app"));
    }
}
