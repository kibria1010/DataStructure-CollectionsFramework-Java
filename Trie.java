package trienode;

import java.util.HashMap;
import java.util.Map;

class TrieNode {
    Map<Character, TrieNode> children = new HashMap<>();
    boolean isEndOfWord = false;
}

public class Trie {
    private final TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    // Insert a word into the Trie
    public void insert(String word) {
        TrieNode node = root;
        for (char c : word.toCharArray()) {
            node.children.putIfAbsent(c, new TrieNode());
            node = node.children.get(c);
        }
        node.isEndOfWord = true;
    }

    // Search for a word in the Trie
    public boolean search(String word) {
        TrieNode node = root;
        for (char c : word.toCharArray()) {
            node = node.children.get(c);
            if (node == null) return false;
        }
        return node.isEndOfWord;
    }

    // Check if any words in the Trie start with the given prefix
    public boolean startsWith(String prefix) {
        TrieNode node = root;
        for (char c : prefix.toCharArray()) {
            node = node.children.get(c);
            if (node == null) return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        Trie trie = new Trie();
        
        trie.insert("cat");
        trie.insert("car");
        trie.insert("can");

        System.out.println(trie.search("cat"));     // true
        System.out.println(trie.search("cab"));     // false
        System.out.println(trie.startsWith("ca"));  // true
        System.out.println(trie.startsWith("dog")); // false
    }
}
