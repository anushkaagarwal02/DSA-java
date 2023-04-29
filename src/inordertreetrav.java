import java.util.*;
class Node2 {
    int val;
    Node2 left;
    Node2 right;

    Node2(int val) {
        this.val = val;
    }
}
public class inordertreetrav {
    Node2 root;
    public void add(int val) {
        Node2 n = new Node2(val);
        if (root == null) {
            root = n;
        }
    }

    public List<Integer> inorder(Node2 root)
    {

    }


    public static void main(String[] args) {
        inordertreetrav  tree = new inordertreetrav();

        tree.add(50);
        tree.add(25);
        tree.add(75);
        tree.add(12);
        tree.add(37);
        tree.add(43);
        tree.add(30);

        tree.inorder(tree.root);
    }
}



