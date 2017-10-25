import java.util.Scanner;

class Node {
    Node ch[];
    boolean eow;
    public Node(){
        ch = new Node[128];
        eow = false;
    }
}

class Trie {
    Node root;
    public Trie(){
        root = new Node();
    }
    public void insert(String s){
        Node cur = root;
        for(char ch : s.toCharArray()){
            if(cur.ch[ch] == null)
                cur.ch[ch] = new Node();
            cur = cur.ch[ch];
        }
        cur.eow = true;
    }
    public boolean search(String s){
        Node cur = root;
        for(char ch : s.toCharArray()){
            if(cur.ch[ch] == null)
                return false;
            cur = cur.ch[ch];
        }
        if(cur.eow == true)
            return true;
        return false;
    }
}

public class Trienode {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Trie root = new Trie();
        System.out.print("Enter the number of words : ");
        int i, n = scan.nextInt();
        String s;
        for(i = 0; i < n; i++){
            s = scan.next();
            root.insert(s);
        }
        System.out.print("Enter the string to search : ");
        s = scan.next();
        if(root.search(s))
            System.out.println("Present!");
        else
            System.out.println("Not Found!");
    }
}
