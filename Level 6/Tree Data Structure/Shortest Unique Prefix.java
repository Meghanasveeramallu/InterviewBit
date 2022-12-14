public class Solution {
    public ArrayList<String> prefix(ArrayList<String> A) {
        TrieNode root = new TrieNode();
	    for (String s : A) {
	        insert(root, s);
	    }
	    ArrayList<String> prefixes = new ArrayList<>();
	    for (String s : A) {
	        prefixes.add(findPrefix(root, s));
	    }
	    return prefixes;
	}
	
	void insert(TrieNode root, String s) {
	    TrieNode node = root;
	    for (Character ch : s.toCharArray()) {
	        node = node.children.computeIfAbsent(ch, c -> new TrieNode());
	        node.count++;
	    }
	}
	
	String findPrefix(TrieNode root, String s) {
	    TrieNode node = root;
	    char[] chars = s.toCharArray();
	    int i = 0;
	    StringBuilder prefix = new StringBuilder();
	    while (true) {
	        char ch = chars[i++];
	        prefix.append(ch);
	        node = node.children.get(ch);
	        if (node.count == 1) {
	            return prefix.toString();
	        }
	    }
	}
	
	class TrieNode {
	    int count = 0;
	    Map<Character, TrieNode> children = new HashMap<>();
    }
}
