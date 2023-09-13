public class ImplementTrie_208 {
    
    private Charnode root;

    public ImplementTrie_208() {
        
        root = new Charnode(' ');
    }

    
    
    public void insert(String word) {
        
        Charnode curr = root;
        for (int i = 0; i < word.length(); i++) {

            char letter = word.charAt(i);
            int index = letter - 'a';

            if (curr.children[index] == null) {
                Charnode newChild = new Charnode(letter);
                curr.children[index] = newChild;
                
            }

           curr = curr.children[index];

        }

        curr.markEnd = true;
    }
    
    public boolean search(String word) {

        Charnode curr = root;

        for (int i = 0; i < word.length(); i++) {
            
            char letter = word.charAt(i);
            int index = letter - 'a';

            if (curr.children[index] == null) {
                return false;
            }

            curr = curr.children[index];
        }

        if (curr.markEnd == true) {
            return true;
        }
        else {
            return false;
        }
        
    }
    
    public boolean startsWith(String prefix) {

        Charnode curr = root;

        for (int i = 0; i < prefix.length(); i++) {
            
            char letter = prefix.charAt(i);
            int index = letter - 'a';

            if (curr.children[index] == null) {
                return false;
            }

            curr = curr.children[index];
        }

        return true;
        
    }
}

public class Charnode {
    public char value;
    public Charnode[] children;
    public boolean markEnd;

    public Charnode(char c) {
        value = c;
        children = new Charnode[26];
        markEnd = false;
    }
}